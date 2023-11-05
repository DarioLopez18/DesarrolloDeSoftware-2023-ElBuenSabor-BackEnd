package com.utn.ElBuenSabor.dtos;

import com.utn.ElBuenSabor.entities.ArticuloManufacturado;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper=false)
@Data
public class CarritoPorductoDTO extends GenericoDTO{
    private int cantidadProductoCarrito;
    private int numeroLinea;
    private CarritoDTO carritoDTO;
    private ArticuloManufacturadoDTO articuloManufacturadoDTO;
}
