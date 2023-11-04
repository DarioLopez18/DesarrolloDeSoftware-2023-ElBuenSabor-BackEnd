package com.utn.ElBuenSabor.dtos;

import com.utn.ElBuenSabor.entities.ArticuloManufacturado;
import com.utn.ElBuenSabor.entities.Carrito;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
public class carritoPorducto extends GenericoDTO{
    private int cantidadProductoCarrito;
    private int numeroLinea;
    private Carrito carrito;
    private ArticuloManufacturado articuloManufacturado;
}
