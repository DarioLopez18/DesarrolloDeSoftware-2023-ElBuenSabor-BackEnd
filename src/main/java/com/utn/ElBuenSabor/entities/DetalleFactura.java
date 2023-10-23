package com.utn.ElBuenSabor.entities;

import jakarta.persistence.*;

import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

@Entity
@Table(name = "detalle_factura")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class DetalleFactura extends Base {

    @NotNull
    private Integer cantidad;

    @NotNull
    @Column(name = "subtotal", precision = 10, scale = 2)
    private BigDecimal subtotal;

    @ManyToOne()
    @JoinColumn(name = "id_articulo_manufacturado")
    private ArticuloManufacturado articuloManufacturado;

    // SOY VALE : esta es la duda que tengo de la relacion si va o no cuando la flecha va para el otro lado ,porque vi que en algunos lo hicieron igual
    //@NotNull
    // @ManyToOne()
    // @JoinColumn(name = "id_factura")
    // private Factura factura;


}
