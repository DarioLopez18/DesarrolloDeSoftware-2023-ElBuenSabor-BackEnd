package com.utn.ElBuenSabor.entities;

import jakarta.persistence.*;

import lombok.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "detalle_pedido")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DetallePedido extends Base {

    @NotNull
    private Integer cantidad;

    @NotNull
    @Column(name = "subtotal", precision = 10, scale = 2)
    private Double subtotal;

    @NotNull
    @Column(name = "subtotal_costo", precision = 10, scale = 2)
    private Double subtotalCosto;

    @ManyToOne()
    @JoinColumn(name = "id_articulo_manufacturado")
    private ArticuloManufacturado articuloManufacturado;

}
