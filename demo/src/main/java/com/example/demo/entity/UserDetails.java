package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private Users user;

    private String name;
    private String gender;
    private int age;
    private String address;

    private LocalDateTime updatedTime;

    public UserDetails (String name, String gender, Integer age, String address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }


    public UserDetails() {

    }
}
