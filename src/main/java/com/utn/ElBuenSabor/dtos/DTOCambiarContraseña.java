package com.utn.ElBuenSabor.dtos;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class DTOCambiarContraseña {
    private Long id;
    private String contraseniaActual;
    private String contraseniaNueva;

}
