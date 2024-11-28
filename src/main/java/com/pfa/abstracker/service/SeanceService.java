package com.pfa.abstracker.service;

import com.pfa.abstracker.entity.Seance;
import com.pfa.abstracker.repository.SeanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeanceService {
    @Autowired
    private SeanceRepository seanceRepository;

    public Seance createSeance(Seance seance) {
        return seanceRepository.save(seance);
    }

    public List<Seance> getAllSeances() {
        return seanceRepository.findAll();
    }
}
