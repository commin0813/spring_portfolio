package org.commin.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.AbstractEnvironment;

@SpringBootApplication
public class SpringBlogJpaApiApplication {

	public static void main(String[] args) {

		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "real");

		SpringApplication.run(SpringBlogJpaApiApplication.class, args);
	}

}
