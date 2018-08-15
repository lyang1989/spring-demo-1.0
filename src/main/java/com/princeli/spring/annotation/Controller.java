package com.princeli.spring.annotation;

import java.lang.annotation.*;

/**
 * @program: spring-demo-1.0
 * @description: ${description}
 * @author: ly
 * @create: 2018-08-09 17:37
 **/
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Controller {
    String value() default  "";
}
