package com.utn.ElBuenSabor.dtos;

import com.utn.ElBuenSabor.entities.ArticuloManufacturadoCombo;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
@EqualsAndHashCode(callSuper=false)
@Data
public class ComboDTO extends GenericoDTO {
    private String nombreCombo;
    private String descripcion;
    private Integer tiempoEstimadoCocinaCombo;
    private BigDecimal precioVenta;
    private BigDecimal costo;
    private String urlImagen;
    private Date fechaAlta;
    private Date fechaModificacion;
    private Date fechaBaja;
    private List<ArticuloManufacturadoCombo> articuloManufacturadoCombos;
}
