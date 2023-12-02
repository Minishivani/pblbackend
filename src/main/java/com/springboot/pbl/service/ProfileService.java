package com.springboot.pbl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.pbl.model.Profile;
import com.springboot.pbl.repository.ProfileRepository;
import com.springboot.pbl.sequence.SequenceGeneratorService;

import java.util.Optional;

@Service
public class ProfileService {
    @Autowired
    ProfileRepository profileRepository;
    @Autowired
    SequenceGeneratorService sequenceGeneratorService;

    public Profile createProfile(Profile profileData) {
        profileData.setId(sequenceGeneratorService.generateSequence(profileData.SEQUENCE_NAME));
        return profileRepository.save(profileData);
    }

    public Optional<Profile> getProfile(String username) {
         return profileRepository.findByUsername(username);
    }

    public Profile updateProfile(Profile updatedProfile) {
        return profileRepository.save(updatedProfile);
    }

    public void deleteProfile(String username) {
        profileRepository.deleteByUsername(username);
    }

}


