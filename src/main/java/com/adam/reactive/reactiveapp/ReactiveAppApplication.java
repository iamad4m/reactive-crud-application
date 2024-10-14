package com.adam.reactive.reactiveapp;

import com.adam.reactive.reactiveapp.service.StudentService;
import com.adam.reactive.reactiveapp.student.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ReactiveAppApplication {
//	Hint: we didn't use spring data jpa and spring web, we used spring data r2dbc and spring reactive web
	public static void main(String[] args) {
		SpringApplication.run(ReactiveAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			StudentService service
	) {
		return args -> {
//			for (int i = 0; i < 100; i++) {
//				service.save(
//						Student.builder()
//								.firstname("FirstName"+i)
//								.lastname("LastName"+i)
//								.age(i)
//								.build()
//				).subscribe();
//				the save method is returning a mono, in order to execute the event we need to subscribe, because we are manually handling the Student outside the HTTP request-response lifecycle.
//				without subscribing, the event will be queued but won't be executed
//			}
		};
	}

}
