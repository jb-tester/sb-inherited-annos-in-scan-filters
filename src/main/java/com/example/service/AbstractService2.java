package com.example.service;

import com.example.annotation.CustomServiceNotInherited;
import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 10/25/2021.</p>
 * <p>Project: Example</p>
 * *
 */
@CustomServiceNotInherited
public abstract class AbstractService2 {
    public abstract String doSomeThing();
}
