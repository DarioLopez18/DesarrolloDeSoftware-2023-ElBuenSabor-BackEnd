package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.dtos.DTOCambiarContraseña;
import com.utn.ElBuenSabor.entities.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UsuarioService extends BaseService<Usuario, Long> {

    List<Usuario> search(String username, String password) throws Exception;

    public boolean cambiarContrasena(DTOCambiarContraseña dtoCambiarContraseña) throws Exception;



}
