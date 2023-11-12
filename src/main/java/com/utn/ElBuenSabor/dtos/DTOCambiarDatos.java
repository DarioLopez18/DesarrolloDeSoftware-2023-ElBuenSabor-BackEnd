package com.utn.ElBuenSabor.dtos;

import lombok.Data;

@Data
public class DTOCambiarDatos extends DTOBase {
    private Long id;
    private String email;
    private String nombre;
    private String apellido;
    private String telefono;

}
