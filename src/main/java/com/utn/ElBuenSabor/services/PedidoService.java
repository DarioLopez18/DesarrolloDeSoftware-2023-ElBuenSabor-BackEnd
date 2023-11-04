package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.Factura;
import com.utn.ElBuenSabor.entities.Pedido;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PedidoService extends BaseService<Pedido,Long>{

    List<Pedido> search(Long filtro) throws Exception;

    Page<Pedido> search(Long filtro, Pageable pageable) throws Exception;
}
