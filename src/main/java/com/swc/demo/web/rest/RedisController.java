package com.swc.demo.web.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;


    @GetMapping("/reids/message")
    public Boolean sendRedis(@RequestParam String message) {
        redisTemplate.opsForValue().set("myKey", "message");
        System.out.println(redisTemplate.opsForValue().get("myKey"));
        return true;
    }
}
