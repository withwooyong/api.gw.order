package com.spring.cloud.api.gw.order.controller;

import com.spring.cloud.api.gw.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;

    @GetMapping
    ResponseEntity<String> getHello() {
        String hello = orderService.getHello();
        return ResponseEntity.ok(hello);
    }

    /**
     * http://localhost:8091/order/name?name=wooyong
     */
    @RequestMapping(path = "/name")
    ResponseEntity<String> getName(@RequestParam String name) {
        String result = orderService.getName(name);
        return ResponseEntity.ok(result);
    }

}
