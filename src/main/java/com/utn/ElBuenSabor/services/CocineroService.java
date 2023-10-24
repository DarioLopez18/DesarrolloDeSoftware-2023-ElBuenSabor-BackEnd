package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.Cocinero;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface CocineroService extends BaseService<Cocinero,Long>{
    List<Cocinero> search(String filtro) throws Exception;

    Page<Cocinero> search(String filtro, Pageable pageable) throws Exception;
}
