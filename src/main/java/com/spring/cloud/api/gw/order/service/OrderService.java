package com.spring.cloud.api.gw.order.service;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {

    public String getHello() {
        return "order hello";
    }

    public String getName(String name) {
        String s = RandomStringUtils.randomAlphabetic(10);
        return name + "_" + s;
    }
}
