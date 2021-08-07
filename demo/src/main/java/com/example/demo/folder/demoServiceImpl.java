package com.example.demo.folder;

import com.example.demo.repository.UsersRepository;
import com.example.demo.dto.userDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class demoServiceImpl implements demoServiceImpltest {

    @Autowired
    UsersRepository userRepository;

    @Override
    public boolean save (userDTO userDTO) {
        try {
//            userRepository.save(userDTO);
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println(e);

        }
       return false;
    }
}
