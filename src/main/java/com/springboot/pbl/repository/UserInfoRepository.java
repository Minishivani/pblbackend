package com.springboot.pbl.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.pbl.entity.UserInfo;

import java.util.Optional;

public interface UserInfoRepository extends MongoRepository<UserInfo, Integer> {
    Optional<UserInfo>  findByName(String username);
    Optional<UserInfo>  findByEmail(String username);
    void deleteByEmail(String username);
}
