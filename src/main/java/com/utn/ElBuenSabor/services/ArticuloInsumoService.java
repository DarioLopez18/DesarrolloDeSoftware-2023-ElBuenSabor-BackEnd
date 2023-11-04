package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.ArticuloInsumo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ArticuloInsumoService extends BaseService<ArticuloInsumo,Long>{
    List<ArticuloInsumo> search(String filtro) throws Exception;

    Page<ArticuloInsumo> search(String filtro, Pageable pageable) throws Exception;
}
