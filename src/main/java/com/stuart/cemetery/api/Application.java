package com.stuart.cemetery.api;

import com.stuart.cemetery.api.repository.CemeteryRepository;
import com.stuart.cemetery.api.repository.GraveRepository;
import com.stuart.cemetery.api.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = {UserRepository.class, GraveRepository.class, CemeteryRepository.class})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
