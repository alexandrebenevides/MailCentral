package io.github.alexandrebenevides.mailcentral.api.service;

import io.github.alexandrebenevides.mailcentral.domain.entity.User;
import io.github.alexandrebenevides.mailcentral.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    
    @Autowired
    private UserRepository userRepository;

    public User authenticateUser(String email, String password) {
        User user = userRepository.findByEmailAndPassword(email, password);
        
        if (user == null) {
            throw new BadCredentialsException("Invalide email or password.");
        }
        
        return user;
    }
}
