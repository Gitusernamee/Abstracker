package com.pfa.abstracker.controller;


import com.pfa.abstracker.dto.UserRegistrationDTO;
import com.pfa.abstracker.entity.Utilisateur;
import com.pfa.abstracker.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<Utilisateur> registerUser(@Valid @RequestBody UserRegistrationDTO registrationDTO) {
        Utilisateur user = userService.registerUser(registrationDTO);
        return ResponseEntity.ok(user);
    }
}
