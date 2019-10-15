package com.lgak.controller;

import bean.SysUser;
import com.lgak.mapper.user.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@Slf4j
@RestController
public class TestController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Autowired
    private RedissonClient redissonClient;

//    @Autowired
//    private ReactiveRedisTemplate reactiveRedisTemplate;

    @GetMapping("/test1")
//    @Transactional
    public String test1(HttpServletResponse response) throws InterruptedException {
//        PageHelper.startPage(1,2);
        log.info("调用");
//        Thread.sleep(5000);

//        User user = User.builder().id(1).build();
//        List<User> users = userMapper.selectAll();

        SysUser build = SysUser.builder().id(1).build();
        SysUser sysUser = userMapper.selectOne(build);
        log.info(sysUser.toString());


        RBucket<String> k3 = redissonClient.getBucket("k3");

        // String k1 = redisTemplate.opsForValue().get("k2");
        return k3.get();
    }

}
