package com.pfa.abstracker.repository;

import com.pfa.abstracker.entity.Classe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClasseRepository extends JpaRepository<Classe, UUID> {}
