package com.das.nic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude=HibernateJpaAutoConfiguration.class)
public class SpringBootWithHibernateApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithHibernateApplication.class, args);
	}

}

