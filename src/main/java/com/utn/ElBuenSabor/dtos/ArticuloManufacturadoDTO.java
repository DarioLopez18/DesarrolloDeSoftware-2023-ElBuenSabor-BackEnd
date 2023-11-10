package com.utn.ElBuenSabor.dtos;

import com.utn.ElBuenSabor.enums.CategoriaProducto;
import com.utn.ElBuenSabor.repositories.ArticuloManufacturadoRepository;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@EqualsAndHashCode(callSuper=false)
@Data
public class ArticuloManufacturadoDTO extends GenericoDTO {
    private String denominacion;
    private CategoriaProducto categoria;
    private String descripcion;
    private BigDecimal precioVenta;
    private String urlImagen;
    private Date fechaAlta;
    private Date fechaBaja;
}