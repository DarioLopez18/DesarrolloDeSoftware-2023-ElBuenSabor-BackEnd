package com.utn.ElBuenSabor.dtos;

import com.utn.ElBuenSabor.entities.ArticuloManufacturado;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper=false)
@Data
public class ArticuloManufacturadoComboDTO extends GenericoDTO {

    private Date fechaHoraDesde;
    private Date fechaHoraHasta;
    private ArticuloManufacturado articuloManufacturado;
}
