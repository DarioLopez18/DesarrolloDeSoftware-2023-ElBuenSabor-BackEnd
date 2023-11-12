package com.utn.ElBuenSabor.entities;

import jakarta.persistence.*;
import lombok.*;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;


@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Base implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "fecha_alta")
    private String fechaAlta;

    @Column(name = "fecha_modificacion")
    private String fechaModificacion;

    @Column(name = "fecha_baja")
    private String fechaBaja;

}