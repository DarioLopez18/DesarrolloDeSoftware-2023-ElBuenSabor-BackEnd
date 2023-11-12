package com.utn.ElBuenSabor.dtos;

import com.utn.ElBuenSabor.entities.Domicilio;
import com.utn.ElBuenSabor.entities.Usuario;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class DTOPersona extends DTOBase{
    private static final SimpleDateFormat dateFormat
            = new SimpleDateFormat("yyyy-MM-dd HH:mm");
    private String nombre;
    private String apellido;

    private String telefono;

    private String email;

    private Usuario usuario;

    private List<Domicilio> domicilios = new ArrayList<>();


}
