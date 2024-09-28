package com.example.userapi.businesslogic.services;

import com.example.userapi.businesslogic.models.User;
import com.example.userapi.dataaccess.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired  // Constructor injection (optional annotation, but best practice to mark it)
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
