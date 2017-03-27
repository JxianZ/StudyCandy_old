package com.studycandy.mu.util;

import java.util.Arrays;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/24
 */
public class Fn {

    /**
     * 命名由下划线小写变驼峰法
     *
     * @param name             待转换的下划线名称
     * @param isFirstUpperCase 首字母是否需要大写，默认小写
     * @return return null if name is null or empty
     */
    public static String camelName(String name, Boolean... isFirstUpperCase) {
        if (name == null || name.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        if (isFirstUpperCase.length != 0 && isFirstUpperCase[0]) {
            // 将第一个字符处理成大写
            result.append(name.substring(0, 1).toUpperCase());
        } else {
            // 将第一个字符保持不变
            result.append(name.substring(0, 1));
        }

        // 循环处理其余字符
        for (int i = 1; i < name.length(); i++) {
            String s = name.substring(i, i + 1);
            // 遇到下划线则舍弃，并把后一个字符变大写
            if (s.equals("_")) {
                i++;
                String nextChar = name.substring(i, i + 1);
                result.append(nextChar.toUpperCase());
            } else {
                // 其他字符直接追加上
                result.append(s);
            }

        }
        return result.toString();
    }

    /**
     * 命名由驼峰法变下划线小写
     *
     * @return return "" if name is null or empty
     */
    public static String underscoreName(String name) {
        if (name == null || name.isEmpty()) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        // 将第一个字符处理成小写
        result.append(name.substring(0, 1).toLowerCase());
        // 循环处理其余字符
        for (int i = 1; i < name.length(); i++) {
            String s = name.substring(i, i + 1);
            // 在大写字母前添加下划线
            if (Arrays.asList(letters).contains(s)) {
                result.append("_");
            }
            // 其他字符直接转成小写
            result.append(s.toLowerCase());
        }
        return result.toString();
    }

    /**
     * null值变成空字符
     */
    public static String nullToEmpty(String str) {
        return str == null ? "" : str;
    }


    /**
     * 端掉字符串右侧的N多指定字符
     *
     * @param str
     * @param needle
     * @return
     */
    public static String rtrim(String str, String needle) {
        int end = str.length();
        while (end != 0 && needle.indexOf(str.charAt(end - 1)) != -1) {
            end--;
        }
        if (end == 0) {
            return "";
        }
        return str.substring(0, end);
    }
}
