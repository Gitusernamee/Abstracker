package com.pfa.abstracker.controller;

import com.pfa.abstracker.entity.Seance;
import com.pfa.abstracker.service.SeanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/seances")
public class SeanceController {
    @Autowired
    private SeanceService seanceService;

    @PostMapping
    public ResponseEntity<Seance> createSeance(@RequestBody Seance seance) {
        Seance createdSeance = seanceService.createSeance(seance);
        return ResponseEntity.ok(createdSeance);
    }
}

