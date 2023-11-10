package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.DetalleArticuloManufacturado;
import com.utn.ElBuenSabor.repositories.BaseRepository;
import com.utn.ElBuenSabor.repositories.DetallePedidoArticuloManufacturadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetallePedidoArticuloManufacturadoServiceImpl extends BaseServiceImpl<DetalleArticuloManufacturado, Long> implements DetallePedidoArticuloManufacturadoService {
    @Autowired
    private DetallePedidoArticuloManufacturadoRepository detallePedidoArticuloManufacturadoRepository;

    public DetallePedidoArticuloManufacturadoServiceImpl(BaseRepository<DetalleArticuloManufacturado, Long> baseRepository, DetallePedidoArticuloManufacturadoRepository detallePedidoArticuloManufacturadoRepository) {
        super(baseRepository);
        this.detallePedidoArticuloManufacturadoRepository = detallePedidoArticuloManufacturadoRepository;
    }

}
