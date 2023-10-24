package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.Factura;
import com.utn.ElBuenSabor.entities.Receta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.function.LongFunction;

public interface FacturaService extends BaseService<Factura,Long>{
    List<Factura> search(Long filtro) throws Exception;

    Page<Factura> search(Long filtro, Pageable pageable) throws Exception;
}
