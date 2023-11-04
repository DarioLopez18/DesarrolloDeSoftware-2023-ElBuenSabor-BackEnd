package com.utn.ElBuenSabor.entities;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "carrito_producto")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class CarritoProducto extends Base{
    @NotNull
    @Column(name="cantidadProductoCarrito")
    private int cantidadProductoCarrito;

    @NotNull
    @Column(name="numeroLinea")
    private int numeroLinea;
//ESTO SE MAPEA EN PRODUCTO
//    @NotNull
//    @ManyToOne()
//    @JoinColumn(name = "id_carrito")
//    private Carrito carrito;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "id_articulo_manufacturado")
    private ArticuloManufacturado articuloManufacturado;
}
