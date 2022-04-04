package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Cleiton = new Student(
						"Cleiton",
						"Cleitinho@gmail.com",
						LocalDate.of(2003, Month.JANUARY, 1)
            );

            Student Rasta = new Student(
						"Rasta",
						"Rasta@gmail.com",
						LocalDate.of(2003, Month.FEBRUARY, 2)
            );

            repository.saveAll(
                    List.of(Cleiton, Rasta)
            );

        };
    }
}
