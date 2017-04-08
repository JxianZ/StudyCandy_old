package com.studycandy.storage.util;

import java.util.UUID;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/4/8
 */
public class FilenameUtil {
    public static String generateUniqueFilename(String origin) {
        String result = origin + "-" + UUID.randomUUID();
        return result;
    }
}
