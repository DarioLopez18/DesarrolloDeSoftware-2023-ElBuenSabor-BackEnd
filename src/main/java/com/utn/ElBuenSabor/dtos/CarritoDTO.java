package com.utn.ElBuenSabor.dtos;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
@EqualsAndHashCode(callSuper=false)
@Data
public class CarritoDTO extends GenericoDTO {
    private Date fechaHoraCreacionCarrito;
    private Integer numeroCarrito;
}
