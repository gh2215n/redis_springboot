package com.gh.redis_springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GuoHeng
 * @date 2022/5/9 0:39
 */

@RestController
@RequestMapping("/redisTest")
public class RedisTestController {

    @Autowired
    private RedisTemplate redisTemplate;

    @GetMapping
    public String testRedis() {
        //設置值到redis
        redisTemplate.opsForValue().set("name","lucy");
        String name = (String)redisTemplate.opsForValue().get("name");
        return name;
    }
}
