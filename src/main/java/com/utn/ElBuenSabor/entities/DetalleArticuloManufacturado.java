package com.utn.ElBuenSabor.entities;

import jakarta.persistence.*;

import lombok.*;
import jakarta.validation.constraints.NotNull;



@Entity
@Table(name = "detalle_articulo_manufacturado")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DetalleArticuloManufacturado extends Base {

    @NotNull
    @Column(name = "cantidad", precision = 10, scale = 2)
    private Double cantidad;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "id_articulo_insumo")
    private ArticuloInsumo articuloInsumo;

}
