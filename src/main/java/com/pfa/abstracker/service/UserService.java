package com.pfa.abstracker.service;

import com.pfa.abstracker.dto.UserRegistrationDTO;
import com.pfa.abstracker.entity.Student;
import com.pfa.abstracker.entity.Utilisateur;
import com.pfa.abstracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private PasswordEncoder passwordEncoder;

    public Utilisateur registerUser(UserRegistrationDTO registrationDTO) {
        Utilisateur user = new Student(); // Exemple, à adapter selon le type d'utilisateur
        user.setEmail(registrationDTO.getEmail());
        user.setNom(registrationDTO.getNom());
//        user.setPassword(passwordEncoder.encode(registrationDTO.getPassword()));
        user.setPassword(registrationDTO.getPassword());
        return userRepository.save(user);
    }

    public Optional<Utilisateur> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
