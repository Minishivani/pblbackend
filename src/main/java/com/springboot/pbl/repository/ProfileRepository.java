package com.springboot.pbl.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.springboot.pbl.model.Profile;

import java.util.Optional;

public interface ProfileRepository extends MongoRepository<Profile, Long> {
    Optional<Profile> findByUsername(String username);
    void deleteByUsername(String username);
}




