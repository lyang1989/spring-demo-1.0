package com.princeli.spring.annotation;

import java.lang.annotation.*;

/**
 * @program: spring-demo-1.0
 * @description: ${description}
 * @author: ly
 * @create: 2018-08-15 09:28
 **/
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RequestParam {
    String value() default  "";
}
