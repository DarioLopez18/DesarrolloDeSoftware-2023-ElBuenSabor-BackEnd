package com.utn.ElBuenSabor.dtos;

import com.utn.ElBuenSabor.enums.CategoriaProducto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;

@EqualsAndHashCode(callSuper=false)
@Data
public class ArticuloManufacturadoDTO extends GenericoDTO{
    private String denominacion;
    private CategoriaProducto categoria;
    private String descripcion;
    private Integer tiempoEstimadoCocina;
    private BigDecimal precioVenta;
    private BigDecimal costo;
    private String urlImagen;
    private Date fechaAlta;
    private Date fechaModificacion;
    private Date fechaBaja;
}
