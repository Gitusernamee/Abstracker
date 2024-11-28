package com.pfa.abstracker.repository;

import com.pfa.abstracker.entity.Seance;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SeanceRepository extends JpaRepository<Seance, UUID> {}
