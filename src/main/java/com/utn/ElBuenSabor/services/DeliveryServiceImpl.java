package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.Delivery;
import com.utn.ElBuenSabor.repositories.BaseRepository;
import com.utn.ElBuenSabor.repositories.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryServiceImpl extends BaseServiceImpl<Delivery, Long> implements DeliveryService{

    @Autowired
    private DeliveryRepository clienteRepository;

    public DeliveryServiceImpl(BaseRepository<Delivery, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Delivery> search(String filtro) throws Exception {
        try{
            //List<Delivery> clientes = clienteRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
            //List<Delivery> clientes = clienteRepository.search(filtro);
            List<Delivery> clientes = clienteRepository.searchNativo(filtro);
            return clientes;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Delivery> search(String filtro, Pageable pageable) throws Exception {
        try{
            //Page<Delivery> clientes = clienteRepository.findByNombreContainingOrApellidoContaining(filtro, filtro, pageable);
            //Page<Delivery> clientes = clienteRepository.search(filtro, pageable);
            Page<Delivery> clientes = clienteRepository.searchNativo(filtro, pageable);
            return clientes;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
