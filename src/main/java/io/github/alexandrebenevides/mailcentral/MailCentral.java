package io.github.alexandrebenevides.mailcentral;

import io.github.alexandrebenevides.mailcentral.domain.entity.User;
import io.github.alexandrebenevides.mailcentral.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MailCentral {
    
    @Bean
    public CommandLineRunner init(@Autowired UserRepository userRepository) {
        return args -> {
            userRepository.create(new User("Alexandre", "alex.benevides@hotmail.com", "123456"));
        };
    }
    
    public static void main(String[] args) {
        SpringApplication.run(MailCentral.class, args);
    }
}
