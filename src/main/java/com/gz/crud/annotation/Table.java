package com.gz.crud.annotation;

import java.lang.annotation.*;

/**
 * @author
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.TYPE})
public @interface Table {

    String value();
}
