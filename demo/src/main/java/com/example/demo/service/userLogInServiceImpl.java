package com.example.demo.service;

import com.example.demo.entity.Users;
import com.example.demo.entity.UserDetails;
import com.example.demo.repository.UserDetailsRepository;
import com.example.demo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class userLogInServiceImpl implements userLoginService{

    @Autowired
    UsersRepository userRepository;

    @Autowired
    UserDetailsRepository userDetailsRepository;

//    @Override
    public boolean save(Users user) {
        userRepository.save(user);
        return true;
    }

    public String logIn(String phoneNumber, String password) {
        String message = "";
        Users user = userRepository.findByphoneNumber(phoneNumber);

        if (user == null) {
            message = "phone number is wrong pls check again!";
            return message;
        }
        UserDetails userDetails = userDetailsRepository.findByUser(user);

        if (password.equals(user.getPassword())) {
            message += "Welcome " + userDetails.getName();
        }
        else {
            message += "password is wrong pls check again!";
        }
        return message;

    }

    public String register(String name, String role, String phoneNumber,
                           String mailId, String gender, int age,
                           String address, String password ) {
        Users user = new Users(role,password, phoneNumber, mailId);
        UserDetails userDetails = new UserDetails(name, gender, age, address);

        Users user1 = userRepository.save(user);
        userDetails.setUser(user1);
        userDetailsRepository.save(userDetails);
        return "registered successfully";
    }

}
