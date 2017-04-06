package com.studycandy.core;

import com.studycandy.core.sql.Page;
import com.studycandy.core.sql.SQLBuilder;
import com.studycandy.core.sql.impl.PageImpl;
import org.junit.Test;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/29
 */
public class PageTest {
    @Test
    public void Test() {
        class User {
        }
        ;
        SQLBuilder sqlBuilder = new SQLBuilder(User.class, "ww_");
        Page page = new PageImpl(sqlBuilder, 10);

    }
}
