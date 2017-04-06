package com.studycandy.core.util;

import com.studycandy.core.constants.Constants;
import com.studycandy.core.sql.Row;

import javax.servlet.http.HttpServletRequest;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/24
 */

public class Fn {
    public Fn() {
    }

    public static String formatSessionName(String sessionName) {
        String path = Fn.class.getClassLoader().getResource("").getPath();
        String flagStr = "/WEB-INF/classes/";
        if (path.indexOf(flagStr) != -1) {
            path = path.substring(0, path.length() - flagStr.length());
            path = path.substring(path.lastIndexOf("/") + 1);
        }

        return path + "_" + sessionName;
    }

    public static Map<String, String> formatParamMap(Map<String, String[]> paramMap) {
        HashMap map = new HashMap();
        Iterator keys = paramMap.keySet().iterator();

        while (keys.hasNext()) {
            String key = (String) keys.next();
            String[] value = (String[]) paramMap.get(key);
            map.put(key, value[value.length - 1]);
        }

        return map;
    }

    public static int time() {
        Long time = Long.valueOf(System.currentTimeMillis() / 1000L);
        return time.intValue();
    }

    public static String date(int timestamp, String... format) {
        if (timestamp == 0) {
            return " - ";
        } else {
            String formatString = "yyyy-MM-dd HH:mm:ss";
            if (format.length == 1) {
                formatString = format[0];
            }

            SimpleDateFormat sdf = new SimpleDateFormat(formatString);
            return sdf.format(new Date((long) timestamp * 1000L));
        }
    }

    public static Row modelToRow(Object model) {
        if (model == null) {
            return null;
        } else {
            Class type = model.getClass();
            Row returnRow = new Row();
            BeanInfo beanInfo = null;

            try {
                beanInfo = Introspector.getBeanInfo(type);
            } catch (IntrospectionException e) {
                e.printStackTrace();
            }

            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

            for (int i = 0; i < propertyDescriptors.length; ++i) {
                PropertyDescriptor descriptor = propertyDescriptors[i];
                String propertyName = descriptor.getName();
                String rowKey = underscoreName(propertyName);
                if (!propertyName.equals("class")) {
                    Method readMethod = descriptor.getReadMethod();
                    Object result = null;

                    try {
                        result = readMethod.invoke(model, new Object[0]);
                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }

                    returnRow.put(rowKey, result);
                }
            }

            return returnRow;
        }
    }

    public static Object rowToModel(Class<?> type, Row row) {
        if (row == null) {
            return null;
        } else {
            BeanInfo modelInfo = null;

            try {
                modelInfo = Introspector.getBeanInfo(type);
            } catch (IntrospectionException e) {
                e.printStackTrace();
            }

            Object obj = null;

            try {
                obj = type.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

            PropertyDescriptor[] propertyDescriptors = modelInfo.getPropertyDescriptors();

            for (int i = 0; i < propertyDescriptors.length; ++i) {
                PropertyDescriptor descriptor = propertyDescriptors[i];
                String propertyName = descriptor.getName();
                if (row.containsKey(propertyName)) {
                    Object value = row.get(propertyName);
                    Object[] args = new Object[]{value};

                    try {
                        Method e3 = descriptor.getWriteMethod();
                        String fieldType = e3.getParameterTypes()[0].getSimpleName();
                        if (fieldType.equals("Integer")) {
                            args[0] = Integer.valueOf(args[0].toString());
                        } else if (fieldType.equals("Short")) {
                            args[0] = Short.valueOf(args[0].toString());
                        } else if (fieldType.equals("Byte")) {
                            args[0] = Byte.valueOf(args[0].toString());
                        }

                        e3.invoke(obj, args);
                    } catch (IllegalArgumentException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }

            return obj;
        }
    }

    public static String ltrim(String str, String needle) {
        int start;
        for (start = 0; start != str.length() && needle.indexOf(str.charAt(start)) != -1; ++start) {
            ;
        }

        return start == str.length() ? "" : str.substring(start);
    }

    public static String rtrim(String str, String needle) {
        int end;
        for (end = str.length(); end != 0 && needle.indexOf(str.charAt(end - 1)) != -1; --end) {
            ;
        }

        return end == 0 ? "" : str.substring(0, end);
    }

    public static String url(String uri) {
        String url = rtrim(SpringContextUtil.getContextPath(), "/") + "/";
        if (uri != null && uri.length() != 0) {
            uri = ltrim(uri, "/");
            if (uri == "") {
                return url;
            } else {
                uri = rtrim(uri, "/");
                uri = underscoreName(uri);
                String urlHtmlSuffix = Constants.URL_SUFFIX;
                if (urlHtmlSuffix != null && urlHtmlSuffix.isEmpty()) {
                    if (urlHtmlSuffix.indexOf(".") != 0) {
                        urlHtmlSuffix = "." + urlHtmlSuffix;
                    }

                    if (uri.indexOf("?") == uri.length() - 1) {
                        uri = uri.substring(0, uri.length() - 1);
                    }

                    if (uri.indexOf("?") != -1) {
                        String[] arr = uri.split("\\?");
                        url = url + rtrim(arr[0], "/") + urlHtmlSuffix + "?" + arr[1];
                    } else {
                        url = url + uri + urlHtmlSuffix;
                    }
                } else {
                    url = url + uri;
                }

                return url;
            }
        } else {
            return url;
        }
    }

    public static String underscoreName(String name) {
        if (name != null && !name.isEmpty()) {
            StringBuilder result = new StringBuilder();
            String[] letters = new String[]{"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
            result.append(name.substring(0, 1).toLowerCase());

            for (int i = 1; i < name.length(); ++i) {
                String s = name.substring(i, i + 1);
                if (Arrays.asList(letters).contains(s)) {
                    result.append("_");
                }

                result.append(s.toLowerCase());
            }

            return result.toString();
        } else {
            return "";
        }
    }

    public static String camelName(String name, Boolean... isFirstUpperCase) {
        if (name != null && !name.isEmpty()) {
            StringBuilder result = new StringBuilder();
            if (isFirstUpperCase.length != 0 && isFirstUpperCase[0].booleanValue()) {
                result.append(name.substring(0, 1).toUpperCase());
            } else {
                result.append(name.substring(0, 1));
            }

            for (int i = 1; i < name.length(); ++i) {
                String s = name.substring(i, i + 1);
                if (s.equals("_")) {
                    ++i;
                    String nextChar = name.substring(i, i + 1);
                    result.append(nextChar.toUpperCase());
                } else {
                    result.append(s);
                }
            }

            return result.toString();
        } else {
            return "";
        }
    }

    public static String nullToEmpty(String str) {
        return str == null ? "" : str;
    }

    public static List<String> getImgSrc(String urlString) {
        String IMGURL_REG = "\\<img\\s+src=.*?\\s*\\/?\\>";
        Matcher matcher = Pattern.compile(IMGURL_REG).matcher(urlString);
        ArrayList listImgUrl = new ArrayList();
        ArrayList listImgSrc = new ArrayList();

        while (matcher.find()) {
            listImgUrl.add(matcher.group());
        }

        Iterator i$ = listImgUrl.iterator();

        while (i$.hasNext()) {
            String string = (String) i$.next();
            Matcher m = Pattern.compile("src\\s*=\\s*\"?(.*?)(\"|>|\\s+)").matcher(string);

            while (m.find()) {
                listImgSrc.add(m.group(1));
            }
        }

        return listImgSrc;
    }

    public static String replaceImgSrc(HttpServletRequest request, String urlString) {
        if (urlString != null && urlString != "") {
            List listImgSrc = getImgSrc(urlString);

            String string;
            for (Iterator i$ = listImgSrc.iterator(); i$.hasNext(); urlString = urlString.replace(string, serverUrl(request, string))) {
                string = (String) i$.next();
            }
        }

        return urlString;
    }

    public static String serverUrl(HttpServletRequest request, String url) {
        if (url.indexOf("http://") < 0) {
            String http = "http://" + request.getServerName() + ":" + request.getServerPort();
            if (url.startsWith("/")) {
                url = http + url;
            } else {
                url = http + "/" + url;
            }
        }
        return url;
    }
}
