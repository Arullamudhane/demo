package com.example.demo.repository;

import com.example.demo.entity.Users;
import com.example.demo.entity.UserDetails;
import org.springframework.data.repository.CrudRepository;

public interface UserDetailsRepository extends CrudRepository<UserDetails,Long> {

    UserDetails findByUser(Users user);
}
