package io.github.alexandrebenevides.mailcentral.api.controller;

import io.github.alexandrebenevides.mailcentral.api.model.request.AuthRequest;
import io.github.alexandrebenevides.mailcentral.api.model.response.AuthResponse;
import io.github.alexandrebenevides.mailcentral.api.service.AuthService;
import io.github.alexandrebenevides.mailcentral.api.service.JwtService;
import io.github.alexandrebenevides.mailcentral.domain.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
    
    @Autowired
    private AuthService authService;

    @Autowired
    private JwtService jwtService;
    
    @PostMapping("/api/login")
    public ResponseEntity<?> authenticateUser(@RequestBody AuthRequest authRequest) {
        User user = authService.authenticateUser(authRequest.getEmail(), authRequest.getPassword());
        String jwt = jwtService.generateToken(user);

        return ResponseEntity.ok(new AuthResponse(jwt));
    }
}
