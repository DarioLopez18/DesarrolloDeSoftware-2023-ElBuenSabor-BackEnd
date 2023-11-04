package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.Combo;
import com.utn.ElBuenSabor.entities.Receta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ComboService extends BaseService<Combo,Long>{
    List<Combo> search(String filtro) throws Exception;

    Page<Combo> search(String filtro, Pageable pageable) throws Exception;
}
