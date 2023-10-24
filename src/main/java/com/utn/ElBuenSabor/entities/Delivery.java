package com.utn.ElBuenSabor.entities;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "delivery")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Delivery extends Base {

    private String nombre;

    private String apellido;

    private String telefono;

    private String email;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @NotNull
    @OneToMany(mappedBy = "delivery")
    private List<Domicilio> domicilios;

    @Column(name = "fecha_alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;

    @Column(name = "fecha_modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaModificacion;

    @Column(name = "fecha_baja")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaBaja;

}
