package com.tais.livros;

import com.tais.livros.model.Course;
import com.tais.livros.repository.CourseRespository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LivrosApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivrosApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CourseRespository courseRespository) {
		return args -> {
			courseRespository.deleteAll();

			Course c = new Course();
			c.setName("Angular com Spring");
			c.setCategory("front-end");
			courseRespository.save(c);
		};
	}

}
