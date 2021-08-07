package com.example.demo.controller;

import com.example.demo.service.userLogInServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("welcome/")
public class LogInController {

    @Autowired
    public userLogInServiceImpl userLogInService;

    @PutMapping(path = "register")
    public String register (@RequestParam("name") String name, @RequestParam("role") String role,
                            @RequestParam("phoneNumber") String phoneNumber,  @RequestParam("mailId") String mailId,
                            @RequestParam("gender") String gender, @RequestParam("age") Integer age,
                            @RequestParam("address") String address,  @RequestParam("password") String password) {

        return userLogInService.register(name, role, phoneNumber, mailId,
                gender, age, address, password);
    }

    @GetMapping(path = "login")
    public String register ( @RequestParam("phoneNumber") String phoneNumber,  @RequestParam("password") String password) {
        return userLogInService.logIn(phoneNumber, password);
    }

    @GetMapping(path = "test")
    public String test (  @RequestParam("phoneNumber") String phoneNumber,  @RequestParam("password") String password) {
        return "SUCCESS";

    }
}
