package com.pfa.abstracker.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("PROF")
public class Prof extends Utilisateur {
    private String matricule;
    @OneToMany(mappedBy = "prof")
    private List<Seance> seances;
}
