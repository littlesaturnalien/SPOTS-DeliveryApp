package org.samm.spots.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Usuario")
@Getter @Setter
public class User {
    @Id
    private String email;

    private String password;

    private String adress;

    private String phone;

    private String role;

}
