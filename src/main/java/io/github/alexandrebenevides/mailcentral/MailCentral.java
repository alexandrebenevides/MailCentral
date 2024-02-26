package io.github.alexandrebenevides.mailcentral;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MailCentral {
    
    public static void main(String[] args) {
        SpringApplication.run(MailCentral.class, args);
    }
}
