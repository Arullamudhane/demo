package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String role;
    private String password;
    private LocalDateTime updatedTime;
    private String phoneNumber;
    private String mailId;

    private String referId;
    public Users(String role, String password, String phoneNumber, String mailId) {
        this.role = role;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.mailId = mailId;
    }


    public Users() {

    }
}
