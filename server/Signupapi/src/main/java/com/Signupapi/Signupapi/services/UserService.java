package com.Signupapi.Signupapi.services;
import com.Signupapi.Signupapi.model.User;
import com.Signupapi.Signupapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<User> getAllUsers()
    {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(user -> users.add(user));
        return users;
    }

    public User createUser(User user)
    {
        userRepository.save(user);
        return user;
    }
}
