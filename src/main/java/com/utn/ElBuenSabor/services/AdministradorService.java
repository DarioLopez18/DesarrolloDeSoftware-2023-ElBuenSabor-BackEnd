package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.Administrador;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface AdministradorService extends BaseService<Administrador,Long>{
    List<Administrador> search(String filtro) throws Exception;

    Page<Administrador> search(String filtro, Pageable pageable) throws Exception;
}
