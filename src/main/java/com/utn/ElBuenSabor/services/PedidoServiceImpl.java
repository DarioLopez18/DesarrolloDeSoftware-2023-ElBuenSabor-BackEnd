package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.Pedido;
import com.utn.ElBuenSabor.repositories.BaseRepository;
import com.utn.ElBuenSabor.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido,Long> implements PedidoService{
    @Autowired
    private PedidoRepository pedidoRepository;

    public PedidoServiceImpl(BaseRepository<Pedido,Long> baseRepository){
        super(baseRepository);
    }
}
