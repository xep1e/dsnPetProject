package com.example.demo.user;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

//@Configuration
public class UsersConfig {
   /* @Bean
    CommandLineRunner commandLineRunner(UsersRepository repository){
        return args -> {
            Users Mariam = new Users(
                    "Kostya", "kostya@gmail.com", LocalDate.of(2000, AUGUST, 20));
            Users Alex = new Users("alex", "alex@gmail.com", LocalDate.of(2004, AUGUST, 20));
            repository.saveAll(List.of(Mariam,Alex));
        };
    }*/
}
