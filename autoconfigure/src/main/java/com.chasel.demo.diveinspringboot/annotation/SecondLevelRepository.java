package com.chasel.demo.diveinspringboot.annotation;

import java.lang.annotation.*;

/**
 * @author XieLongzhen
 * @date 2019/3/31 21:23
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@FirstLevelRepository
public @interface SecondLevelRepository {
    String value() default "";
}
