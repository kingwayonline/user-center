package com.lgak.controller;

import com.lgak.bean.user.User;
import com.lgak.mapper.user.UserMapper;
import lombok.extern.slf4j.Slf4j;
import lombok.var;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ReactiveRedisTemplate;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @Autowired
    private RedissonClient redissonClient;

//    @Autowired
//    private ReactiveRedisTemplate reactiveRedisTemplate;

    @GetMapping("/test1")
//    @Transactional
    public String test1() {
//        PageHelper.startPage(1,2);
        log.info("调用");
        var user2 = new User();
        user2.setId(1);

        User user = User.builder().id(1).build();
        List<User> users = userMapper.selectAll();

        RBucket<String> k3 = redissonClient.getBucket("k3");

        // String k1 = redisTemplate.opsForValue().get("k2");
        return k3.get();
    }

}
