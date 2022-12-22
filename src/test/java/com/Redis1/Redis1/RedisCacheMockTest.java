package com.Redis1.Redis1;

import com.Redis1.Redis1.entities.redis.UserRedis;
import com.Redis1.Redis1.repositories.redis.UserRepositoryRedis;
import com.Redis1.Redis1.services.UserService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Redis1CacheMock.class)
public class RedisCacheMockTest {

    @Autowired
    private UserRepositoryRedis userRepositoryRedis;

    @Autowired
    private UserService userService;

    @Test
    public void souldWriteOnRedisCache(){
        UserRedis userRedis = new UserRedis();
        userRedis.setId(1L);
        userRedis.setEmail("giosalv21@gmail.com");
        userRedis.setFirstName("Giovanni");

        UserRedis userSavedInRedisCache = userRepositoryRedis.save(userRedis);

        Assertions.assertNotNull(userSavedInRedisCache);
    }

    @Test
    public void shouldCreateUser(){
        //userService.create()
    }

    @Test
    public void shouldGetUserFromCache(){
        //userService.readOne()
    }

    @Test
    public void shouldDeleteUser(){
        //userService.delete();
    }

    @Test
    public void shouldUpdateUser(){
        //userService.update();
    }
}
