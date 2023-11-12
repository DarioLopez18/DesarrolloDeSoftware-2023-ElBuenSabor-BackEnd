package com.utn.ElBuenSabor.entities;

import com.utn.ElBuenSabor.enums.Rol;
import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;
import lombok.*;


@Entity
@Getter
@Setter
@Table(name = "usuario")
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Usuario extends Base {

    @NotNull
    @Column(name = "auth0_id", nullable = false, unique = true)
    private String auth0Id;

    @NotNull
    @Column(name = "username", nullable = false)
    private String username;

    @NotNull
    @Column (name = "password", nullable = false)
    private String password;

    @NotNull
    @Column (name = "rol", nullable = false)
    private Rol rol;


}
