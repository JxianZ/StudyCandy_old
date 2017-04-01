package com.studycandy.core.sql;

import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)

/**
 * 数据库表名注解,引入jpa太大，所以自己写一个
 * @author Simon
 *
 */
public @interface Table {

    /**
     * 数据库中的表名
     *
     * @return
     */
    String name() default "";
}
