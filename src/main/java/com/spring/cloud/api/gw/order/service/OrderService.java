package com.spring.cloud.api.gw.order.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class OrderService {

    public String getName(String name) {
        return "orderName=" + name;
    }

}
