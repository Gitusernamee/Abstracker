package com.pfa.abstracker.service;
import com.pfa.abstracker.dto.UserRegistrationDTO;
import com.pfa.abstracker.entity.Student;
import com.pfa.abstracker.entity.Utilisateur;
import com.pfa.abstracker.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
    @Mock
    private UserRepository userRepository;

    @Mock
    private PasswordEncoder passwordEncoder;

    @InjectMocks
    private UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void registerUser_Success() {
        // Préparation des données de test
        UserRegistrationDTO dto = new UserRegistrationDTO(
                "test@example.com",
                "password123",
                "Nom",
                "Prenom"
        );

        Utilisateur user = new Student();
        user.setEmail(dto.getEmail());

        // Configuration du mock
        when(passwordEncoder.encode(dto.getPassword())).thenReturn("encodedPassword");
        when(userRepository.save(any(Utilisateur.class))).thenReturn(user);

        // Exécution du test
        Utilisateur registeredUser = userService.registerUser(dto);

        // Vérifications
        assertNotNull(registeredUser);
        assertEquals(dto.getEmail(), registeredUser.getEmail());
        verify(passwordEncoder).encode(dto.getPassword());
        verify(userRepository).save(any(Utilisateur.class));
    }
}
