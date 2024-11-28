package com.pfa.abstracker.repository;

import com.pfa.abstracker.entity.Presence;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PresenceRepository extends JpaRepository<Presence, UUID> {}
