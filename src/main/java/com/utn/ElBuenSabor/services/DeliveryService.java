package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.Delivery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface DeliveryService extends BaseService<Delivery,Long>{
    List<Delivery> search(String filtro) throws Exception;

    Page<Delivery> search(String filtro, Pageable pageable) throws Exception;
}
