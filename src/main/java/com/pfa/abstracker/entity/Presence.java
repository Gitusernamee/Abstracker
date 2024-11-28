package com.pfa.abstracker.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Presence {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private Date dateMarquage;

    @ManyToOne
    private Seance seance;

    @ManyToOne
    private Student student;
}
