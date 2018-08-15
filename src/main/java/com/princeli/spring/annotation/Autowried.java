package com.princeli.spring.annotation;

import java.lang.annotation.*;

/**
 * @program: spring-demo-1.0
 * @description: ${description}
 * @author: ly
 * @create: 2018-08-15 09:27
 **/
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Autowried {
    String value() default  "";
}
