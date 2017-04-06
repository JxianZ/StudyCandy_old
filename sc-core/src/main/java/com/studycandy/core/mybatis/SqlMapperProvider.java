package com.studycandy.core.mybatis;

import com.studycandy.core.base.SOMap;


/**
 * 运行自定义sql的Provider实现类
 *
 * @author Simon
 */
public class SqlMapperProvider {
    public SqlMapperProvider() {
    }

    public String select(SOMap somap) {
        return somap.get("sql").toString();
    }

    public String update(SOMap somap) {
        return somap.get("sql").toString();
    }

    public String insert(SOMap somap) {
        return somap.get("sql").toString();
    }

    public String delete(SOMap somap) {
        return somap.get("sql").toString();
    }
}

