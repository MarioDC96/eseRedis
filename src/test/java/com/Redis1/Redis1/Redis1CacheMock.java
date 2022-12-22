package com.Redis1.Redis1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.TestConfiguration;
import redis.embedded.RedisServer;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@TestConfiguration
public class Redis1CacheMock {

    private RedisServer redisServer;

    @Value("${redis.port}") int redisPort;

    @PostConstruct
    public void postConstruct() {
        try {
            redisServer = new RedisServer(redisPort);
            redisServer.start();
        }catch(Exception e){
            System.out.println(e);
            throw e;
        }
    }

    @PreDestroy
    public void preDestroy() {
        redisServer.stop();
    }
}
