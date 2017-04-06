package com.studycandy.a2c.service.impl;

import com.studycandy.a2c.mapper.AppMapper;
import com.studycandy.a2c.model.App;
import com.studycandy.a2c.service.AppService;
import com.studycandy.core.mybatis.SqlRunner;
import com.studycandy.core.sql.Row;
import com.studycandy.core.sql.SQLBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/29
 */
@Service
public class AppServiceImpl implements AppService {
    private final AppMapper mapper;
    private final SqlRunner sqlRunner;

    @Autowired
    public AppServiceImpl(AppMapper mapper, SqlRunner sqlRunner) {
        this.mapper = mapper;
        this.sqlRunner = sqlRunner;
    }

    @Override
    public Integer addApp(App entity) {
        return mapper.insert(entity);
    }

    @Override
    public Integer deleteAppById(Integer id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateApp(App entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    @Override
    public App getAppById(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<App> getAll() {
        return mapper.selectAll();
    }

    @Override
    public Integer getAppIdByAppKey(String appkey) {
        SQLBuilder sqlBuilder = new SQLBuilder(App.class);
        String sql = sqlBuilder.fields("id").where("app_key=", appkey).selectSql();
        List<Row> rowList = sqlRunner.select(sql);
        if (rowList.size() != 0)
            return rowList.get(0).getInt("id");
        return null;
    }
}
