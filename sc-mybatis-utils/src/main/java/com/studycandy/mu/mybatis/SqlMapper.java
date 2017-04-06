package com.studycandy.mu.mybatis;

import com.studycandy.mu.base.SOMap;
import com.studycandy.mu.sql.Row;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;

import java.util.List;

/**
 * 通用mapper
 *
 * @author Simon
 */
public interface SqlMapper {

    /**
     * 返回二维结果集
     *
     * @param somap
     * @return
     */
    @SelectProvider(type = SqlMapperProvider.class, method = "select")
    public List<Row> select(SOMap somap);

    /**
     * 返回单行记录
     *
     * @param somap
     * @return
     */
    @SelectProvider(type = SqlMapperProvider.class, method = "select")
    public Row find(SOMap somap);

    /**
     * 返回统计数量
     *
     * @param somap
     * @return
     */
    @SelectProvider(type = SqlMapperProvider.class, method = "select")
    public Integer count(SOMap somap);

    /**
     * 返回特定字段的值
     *
     * @param somap
     * @return
     */
    @SelectProvider(type = SqlMapperProvider.class, method = "select")
    public Object getValue(SOMap somap);

    /**
     * insert方法
     *
     * @param somap
     * @return
     */
    @InsertProvider(type = SqlMapperProvider.class, method = "insert")
    public Integer insert(SOMap somap);

    /**
     * update方法
     *
     * @param somap
     * @return
     */
    @UpdateProvider(type = SqlMapperProvider.class, method = "update")
    public Integer update(SOMap somap);

    /**
     * delete方法
     *
     * @param somap
     * @return
     */
    @DeleteProvider(type = SqlMapperProvider.class, method = "delete")
    public Integer delete(SOMap somap);
}