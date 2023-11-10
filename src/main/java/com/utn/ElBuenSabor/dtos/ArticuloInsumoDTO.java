package com.utn.ElBuenSabor.dtos;

import com.utn.ElBuenSabor.entities.RubroArticuloManufacturado;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


import java.math.BigDecimal;
import java.util.Date;

@Setter
@Getter
@EqualsAndHashCode(callSuper=false)
@Data
public class ArticuloInsumoDTO extends GenericoDTO {
    private String denominacion;
    private String urlImagen;
    private BigDecimal precioCompra;
    private BigDecimal stockActual;
    private BigDecimal stockMinimo;
    private UnidadMedida unidadMedida;
    private RubroArticuloManufacturado rubroArticulo;
    private Date fechaAlta;
    private Date fechaModificacion;
    private Date fechaBaja;
}
