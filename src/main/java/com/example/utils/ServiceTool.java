package com.example.utils;

import com.example.service.ServiceOne;
import com.example.service.ServiceTwo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceTool {

    @Autowired
    ServiceOne serviceOne;

    @Autowired(required = false)
    ServiceTwo serviceTwo;

    public void doInheritedServices() {
        try {
            System.out.println(serviceOne.doSomeThing());
        } catch (NullPointerException npe) {
            System.out.println(npe.getMessage());
        }

    }
    public void doNotInheritedServices() {
        try {
            System.out.println(serviceTwo.doSomeThing());
        } catch (NullPointerException npe) {
            System.out.println(npe.getMessage());
        }

    }
}
