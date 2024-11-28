package com.pfa.abstracker.entity;

import com.pfa.abstracker.enumeration.*;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Classe {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private int annee;

    @Enumerated(EnumType.STRING)
    private Branche branche;

    @Enumerated(EnumType.STRING)
    private Groupe groupe;

    @Enumerated(EnumType.STRING)
    private SousGroupe sousGroupe;
}