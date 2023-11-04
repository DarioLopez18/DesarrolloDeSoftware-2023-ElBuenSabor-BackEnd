package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.Factura;
import com.utn.ElBuenSabor.entities.Pedido;
import com.utn.ElBuenSabor.repositories.BaseRepository;
import com.utn.ElBuenSabor.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServiceImpl extends BaseServiceImpl<Pedido,Long> implements PedidoService{
    @Autowired
    private PedidoRepository pedidoRepository;

    public PedidoServiceImpl(BaseRepository<Pedido,Long> baseRepository){
        super(baseRepository);
    }

    @Override
    public List<Pedido> search(Long filtro) throws Exception {
        try{
            List<Pedido> pedidos = pedidoRepository.findByIdContaining(filtro);
            return pedidos;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Pedido> search(Long filtro, Pageable pageable) throws Exception {
        try{
            Page<Pedido> pedidos = pedidoRepository.findByIdContaining (filtro, pageable);
            return pedidos;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
