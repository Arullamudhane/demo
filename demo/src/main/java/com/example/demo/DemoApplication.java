
package com.example.demo;
import com.example.demo.dto.userDTO;
import com.example.demo.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
//@RequestMapping("/user")
public class DemoApplication {

	@Autowired
	com.example.demo.folder.demoServiceImpltest demoServiceImpltest;

	@Autowired
	com.example.demo.service.userLoginService userLoginService;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		userDTO userDTOs = new userDTO();
		userDTOs.setName("LC");
		userDTOs.setAddress("AddressOfIndia");
		userDTOs.setAge(22);
		userDTOs.setPassword("123");
		userDTOs.setPhoneNumber("9952400694");
		userDTOs.setGender("Male");

		demoServiceImpltest.save(userDTOs);
		Users user = new Users();
		user.setPassword("123");
		userLoginService.save(user);
		return String.format("Hello %s!", name);
	}

}
            