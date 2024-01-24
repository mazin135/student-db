package com.example.demo;

import com.example.demo.student.Student;
import com.example.demo.student.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
           Student mazin = new Student(
                    "Mazin",
                    LocalDate.of(2002, Month.JANUARY,28),
                    "muzakkirm135@gmail.com"


            );

             Student maleeha = new Student(
                    "Maleeha",
                    LocalDate.of(2000, Month.AUGUST,20),
                    "mahamkx@gmail.com"


            );
            studentRepository.saveAll(
                    List.of(mazin,maleeha)
            );
        };
    }

}
