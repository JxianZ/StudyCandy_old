package com.studycandy.core.sql.impl;

import com.studycandy.core.sql.Page;
import com.studycandy.core.sql.SQLBuilder;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/29
 */
// TODO: 2017/3/29 Created By Chenls
// 辣鸡实现 重写
public class PageImpl implements Page {
    private final Integer pageSize;
    private final String fieldString;
    private final String whereString;
    private final String orderString;
    private final String joinString;
    private final String groupString;
    private SQLBuilder sqlBuilder;
    private Integer pageNum;

    public PageImpl(SQLBuilder sqlBuilder, Integer pageSize) {
        this.sqlBuilder = sqlBuilder;
        this.pageSize = pageSize;
        fieldString = sqlBuilder.getFieldString();
        whereString = sqlBuilder.getWhereString();
        orderString = sqlBuilder.getOrderString();
        joinString = sqlBuilder.getJoinString();
        groupString = sqlBuilder.getGroupString();
        pageNum = 0;
    }

    @Override
    public Page previousPage() {
        return this.getPage(pageNum - 1);
    }

    @Override
    public Page nextPage() {
        return this.getPage(pageNum + 1);
    }

    @Override
    public Page getPage(Integer page) {
        pageNum = page;
        return this;
    }

    @Override
    public Integer getPageNum() {
        return pageNum;
    }

    @Override
    public String toString() {
        sqlBuilder.setFieldString(fieldString);
        sqlBuilder.setWhereString(whereString);
        sqlBuilder.setJoinString(joinString);
        sqlBuilder.setOrderString(orderString);
        sqlBuilder.setGroupString(groupString);
        return sqlBuilder.page(pageNum + 1, pageSize).selectSql();
    }
}
