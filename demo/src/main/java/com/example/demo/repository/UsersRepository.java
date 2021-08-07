package com.example.demo.repository;

import com.example.demo.entity.Users;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsersRepository extends CrudRepository<Users, Long> {

    Optional<Users> findById(Long id);

    Users findByphoneNumber(String phoneNumber);
}
