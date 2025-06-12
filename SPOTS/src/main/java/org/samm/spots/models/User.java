package org.samm.spots.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Usuario")
public class User {
    @Id
    private String email;

    private String password;
}
