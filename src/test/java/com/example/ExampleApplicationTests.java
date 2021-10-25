package com.example;

import com.example.service.ServiceOne;
import com.example.service.ServiceTwo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

@SpringBootTest
class ExampleApplicationTests {
    @Autowired(required = false)
    ServiceOne serviceOne; // autowiring should work

    @Autowired(required = false)
    ServiceTwo serviceTwo; // autowiring should not work

    @Test
    void testOne() {
        assertNotNull(serviceOne);
    }
    @Test
    void testTwo() {
        assertNull(serviceTwo);
    }
}
