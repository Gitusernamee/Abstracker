package com.pfa.abstracker.service;

import com.pfa.abstracker.entity.Presence;
import com.pfa.abstracker.repository.PresenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PresenceService {
    @Autowired
    private PresenceRepository presenceRepository;

    public Presence enregistrerPresence(Presence presence) {
        return presenceRepository.save(presence);
    }
}