package com.Redis1.Redis1.repositories.redis;

import com.Redis1.Redis1.entities.redis.UserRedis;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepositoryRedis extends CrudRepository<UserRedis, Long> {
}