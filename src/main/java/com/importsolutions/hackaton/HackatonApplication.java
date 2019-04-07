package com.importsolutions.hackaton;

import java.util.UUID;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.importsolutions.hackaton.repository.UserRepository;
import com.importsolutions.hackaton.security.entity.User;
import com.importsolutions.hackaton.security.enums.ProfileEnum;
@SpringBootApplication
public class HackatonApplication {

	public static void main(String[] args) {
		SpringApplication.run(HackatonApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		return args -> {
			initUsers(userRepository, passwordEncoder);
		};

	}

	private void initUsers(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		User user = new User();



		user.setId(UUID.randomUUID().toString().toUpperCase());
		user.setEmail("rodrigogregorioneri@hotmail.com");
		user.setPassword(passwordEncoder.encode("admin"));
		user.setProfile(ProfileEnum.ROLE_ADMIN);

		User find = userRepository.findByEmail("rodrigogregorioneri@hotmail.com");
		if (find == null) {
			userRepository.save(user);
		}
	}

}
