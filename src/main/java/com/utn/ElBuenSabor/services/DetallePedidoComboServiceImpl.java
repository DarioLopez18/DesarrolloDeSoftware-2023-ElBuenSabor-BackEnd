package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.DetallePedido;
import com.utn.ElBuenSabor.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetallePedidoComboServiceImpl extends BaseServiceImpl<DetallePedido, Long> implements DetallePedidoComboService{

    @Autowired
    private DetallePedidoComboRepository detallePedidoComboRepository;

    public DetallePedidoComboServiceImpl(BaseRepository<DetallePedido, Long> baseRepository, DetallePedidoComboRepository detallePedidoComboRepository) {
        super(baseRepository);
        this.detallePedidoComboRepository = detallePedidoComboRepository;
    }
}
