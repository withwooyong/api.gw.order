package com.spring.cloud.api.gw.order.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OrderServiceTest {

    @Autowired
    OrderService orderService;

    @BeforeEach
    void setUp() {
    }

    @Test
    void getHello() {
        String hello = orderService.getHello();
        System.out.println(hello);
    }

    @Test
    void getName() {
        String name = orderService.getName("name");
        System.out.println(name);
    }
}