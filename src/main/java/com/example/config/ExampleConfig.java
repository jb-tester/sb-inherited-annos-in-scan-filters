package com.example.config;

import com.example.annotation.CustomServiceInherited;
import com.example.annotation.CustomServiceNotInherited;
import com.example.service.AbstractExampleService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(basePackageClasses = AbstractExampleService.class, includeFilters = {
        @ComponentScan.Filter(CustomServiceInherited.class)
        ,@ComponentScan.Filter(CustomServiceNotInherited.class)})
public class ExampleConfig {
}
