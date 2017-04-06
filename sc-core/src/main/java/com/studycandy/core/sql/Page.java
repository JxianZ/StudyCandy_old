package com.studycandy.core.sql;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/29
 */
public interface Page {
    Page previousPage();

    Page nextPage();

    Page getPage(Integer page);

    Integer getPageNum();
}
