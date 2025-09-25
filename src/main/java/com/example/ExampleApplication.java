package com.example;

import com.example.utils.ServiceTool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }
    @Autowired
    ServiceTool tool;
    @Override
    public void run(String... args) throws Exception {
       tool.doInheritedServices();
       tool.doNotInheritedServices();
    }
}
