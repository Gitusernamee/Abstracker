package com.pfa.abstracker.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Seance {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne
    private Prof prof;

    @ManyToOne
    private Classe classe;

    private String matiere;

    @OneToOne(cascade = CascadeType.ALL)
    private QRCode qrCode;

    @OneToMany(mappedBy = "seance")
    private List<Presence> presences;
}