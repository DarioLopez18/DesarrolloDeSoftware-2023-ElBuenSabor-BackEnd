package com.utn.ElBuenSabor.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
@Setter
@Getter
@EqualsAndHashCode(callSuper=false)
@Data
public class ComboDTO extends GenericoDTO {
    private String nombreCombo;
    private String descripcion;
    private BigDecimal precioVenta;
    private String urlImagen;
    private Date fechaAlta;
    private Date fechaBaja;
    private List<ArticuloManufacturadoComboDTO> articuloManufacturadoCombosDTO;
}
