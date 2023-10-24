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
    private DeliveryRepository deliveryRepository;

    public DeliveryServiceImpl(BaseRepository<Delivery, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Delivery> search(String filtro) throws Exception {
        try{
            //List<Delivery> deliverys = deliveryRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
            //List<Delivery> deliverys = deliveryRepository.search(filtro);
            List<Delivery> deliverys = deliveryRepository.searchNativo(filtro);
            return deliverys;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Delivery> search(String filtro, Pageable pageable) throws Exception {
        try{
            //Page<Delivery> deliverys = deliveryRepository.findByNombreContainingOrApellidoContaining(filtro, filtro, pageable);
            //Page<Delivery> deliverys = deliveryRepository.search(filtro, pageable);
            Page<Delivery> deliverys = deliveryRepository.searchNativo(filtro, pageable);
            return deliverys;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
