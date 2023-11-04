package com.utn.ElBuenSabor.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
@EqualsAndHashCode (callSuper=false)
@Data
public class carritoDTO extends GenericoDTO {
    private Date fechaHoraCreacionCarrito;
    private Integer numeroCarrito;
}
