package com.pfa.abstracker.entity;

import com.pfa.abstracker.enumeration.Centre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("STUDENT")
public class Student extends Utilisateur {
    private String cne;

    @Enumerated(EnumType.STRING)
    private Centre campus;

    @OneToMany(mappedBy = "student")
    private List<Presence> presences;
}
