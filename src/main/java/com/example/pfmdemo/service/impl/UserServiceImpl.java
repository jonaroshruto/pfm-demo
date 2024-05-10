package com.example.pfmdemo.service.impl;

import com.example.pfmdemo.dto.UserDTO;
import com.example.pfmdemo.model.User;
import com.example.pfmdemo.repo.UserRepository;
import com.example.pfmdemo.service.UserRegService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserRegService {
    @Autowired
    private UserRepository userRepository;


    public UserServiceImpl(){

    }
    public void saveUser(User user){
        this.userRepository.save(user);
    }

//    @Override
//    public void saveUser(User user) {
//       User newUser = new User();
//       newUser.setFirstName(user.getFirstName());
//       newUser.setLastName(user.getLastName());
//       newUser.setUserAge(user.getUserAge());
//       newUser.setEmailAddress(user.getEmailAddress());
//       //user.setEmailID(UserDTO.getEmail());
//        userRepository.save(newUser);
//    }

    @Override
    public User findByEmailAddress(String emailAddress) {
        return userRepository.findByEmailAddress(emailAddress);
    }

    @Override
    public List<User> findAllUsers() {
       List<User> users = userRepository.findAll();
       return users;
    }
    private UserDTO convertEntityToDTO(){
        return null;
    }
}
