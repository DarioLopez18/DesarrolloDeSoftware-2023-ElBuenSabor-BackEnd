package com.utn.ElBuenSabor.entities;

import jakarta.persistence.*;

import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "detalle_articulo_manufacturado")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DetallePedidoArticuloManufacturado extends Base {

    @NotNull
    @Column(name = "cantidad")
    private Integer cantidad;

    @NotNull
    @Column(name="subTotal", precision = 10, scale = 2)
    private BigDecimal subTotal;

    @NotNull
    @Column(name="subTotalCosto", precision = 10, scale = 2)
    private BigDecimal subTotalCosto;
//ESTA RELACION SE MAPEA EN PEDIDO
    @NotNull
    @ManyToOne()
    @JoinColumn(name = "id_detallePedido")
    private Pedido detallePedido;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "id_articulo_manufacturado")
    private ArticuloManufacturado articuloManufacturado;

}
