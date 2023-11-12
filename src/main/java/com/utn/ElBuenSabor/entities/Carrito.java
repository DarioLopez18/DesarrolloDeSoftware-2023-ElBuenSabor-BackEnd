package com.utn.ElBuenSabor.entities;

import jakarta.persistence.*;
import lombok.*;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "carrito")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Carrito extends Base{

    @NotNull
    @Column(name = "fecha_hora_creacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraCreacionCarrito;

    @NotNull
    @Column(name="numeroCarrito")
    private Integer numeroCarrito;

    @NotNull
    @OneToMany()
    @JoinColumn(name = "id_carrito")
    private List<CarritoProducto> carritoProductos;
}
