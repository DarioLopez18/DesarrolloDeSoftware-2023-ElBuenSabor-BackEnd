package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.Factura;
import com.utn.ElBuenSabor.entities.Receta;
import com.utn.ElBuenSabor.repositories.BaseRepository;
import com.utn.ElBuenSabor.repositories.DetalleFacturaRepository;
import com.utn.ElBuenSabor.repositories.DomicilioRepository;
import com.utn.ElBuenSabor.repositories.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServiceImpl extends BaseServiceImpl<Factura, Long> implements FacturaService{

    @Autowired
    private FacturaRepository facturaRepository;

    public FacturaServiceImpl(BaseRepository<Factura, Long> baseRepository, FacturaRepository facturaRepository) {
        super(baseRepository);
        this.facturaRepository=facturaRepository;

    }

    @Override
    public List<Factura> search(Long filtro) throws Exception {
        try{
            List<Factura> facturas = facturaRepository.findByIdContaining(filtro);
            return facturas;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Factura> search(Long filtro, Pageable pageable) throws Exception {
        try{
            Page<Factura> facturas = facturaRepository.findByIdContaining(filtro, pageable);
            return facturas;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
