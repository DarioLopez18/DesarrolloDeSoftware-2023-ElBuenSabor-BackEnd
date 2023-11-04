package com.utn.ElBuenSabor.dtos;

import com.utn.ElBuenSabor.entities.RubroArticulo;
import com.utn.ElBuenSabor.entities.UnidadMedida;
import lombok.Data;
import lombok.EqualsAndHashCode;


import java.math.BigDecimal;
import java.util.Date;

@EqualsAndHashCode(callSuper=false)
@Data
public class ArticuloInsumoDTO extends GenericoDTO {
    private String denominacion;
    private String urlImagen;
    private BigDecimal precioCompra;
    private BigDecimal stockActual;
    private BigDecimal stockMinimo;
    private UnidadMedida unidadMedida;
    private RubroArticulo rubroArticulo;
    private Date fechaAlta;
    private Date fechaModificacion;
    private Date fechaBaja;
}
