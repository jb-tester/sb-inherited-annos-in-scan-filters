package com.example.annotation;

import java.lang.annotation.*;


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface CustomServiceNotInherited {
}
