package com.battip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


//@EnableJpaRepositories(basePackages = "com.battip" )
//@EntityScan(basePackages = "com.battip")
@SpringBootApplication(scanBasePackages = "com.battip")
		//(exclude={DataSourceAutoConfiguration.class})
public class SpringMineApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMineApplication.class, args);
	}

}
