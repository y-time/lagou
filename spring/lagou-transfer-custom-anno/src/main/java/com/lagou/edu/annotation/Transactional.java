package com.lagou.edu.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Transactional，标识有这个注解的类添加事务控制
 *
 * @author ying
 * @version 1.0
 * @date 2021-03-23 23:12
 */
@Target(ElementType.TYPE) // 只修饰接口、类、枚举
@Retention(RetentionPolicy.RUNTIME)  // 在运行时有效
public @interface Transactional {
    String value() default "";
}
