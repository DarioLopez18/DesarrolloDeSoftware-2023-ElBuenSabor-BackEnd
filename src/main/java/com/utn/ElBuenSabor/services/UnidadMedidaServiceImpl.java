package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.Receta;
import com.utn.ElBuenSabor.repositories.BaseRepository;
import com.utn.ElBuenSabor.repositories.UnidadMedidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadMedidaServiceImpl extends BaseServiceImpl<UnidadMedida,Long> implements UnidadMedidaService{
    @Autowired
    private UnidadMedidaRepository unidadMedidaRepository;

    public UnidadMedidaServiceImpl(BaseRepository<UnidadMedida,Long> baseRepository,UnidadMedidaRepository unidadMedidaRepository){
        super(baseRepository);
        this.unidadMedidaRepository = unidadMedidaRepository;
    }

    @Override
    public List<UnidadMedida> search(String filtro) throws Exception {
        try{
            List<UnidadMedida> unidadMedidas = unidadMedidaRepository.findByDenominacionContaining(filtro);
            return unidadMedidas;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<UnidadMedida> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<UnidadMedida> unidadMedidas = unidadMedidaRepository.findByDenominacionContaining(filtro, pageable);
            return unidadMedidas;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
