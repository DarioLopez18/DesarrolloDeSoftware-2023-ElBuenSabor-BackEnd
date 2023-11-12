package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.dtos.DTOCambiarContrasenia;
import com.utn.ElBuenSabor.entities.Usuario;

import java.util.List;

public interface UsuarioService extends BaseService<Usuario, Long> {

    List<Usuario> search(String username, String password) throws Exception;

    public boolean cambiarContrasena(DTOCambiarContrasenia dtoCambiarContraseña) throws Exception;



}
