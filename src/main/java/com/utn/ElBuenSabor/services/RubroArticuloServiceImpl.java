package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.RubroArticuloManufacturado;
import com.utn.ElBuenSabor.repositories.BaseRepository;
import com.utn.ElBuenSabor.repositories.RubroArticuloManufacturadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RubroArticuloServiceImpl extends BaseServiceImpl<RubroArticuloManufacturado,Long> implements RubroArticuloService{
    @Autowired
    private RubroArticuloManufacturadoRepository rubroArticuloRepository;

    public RubroArticuloServiceImpl(BaseRepository<RubroArticuloManufacturado,Long> baseRepository, RubroArticuloManufacturadoRepository rubroArticuloRepository){
        super(baseRepository);
        this.rubroArticuloRepository = rubroArticuloRepository;
    }

    @Override
    public List<RubroArticuloManufacturado> search(String filtro) throws Exception {
        try{
            List<RubroArticuloManufacturado> rubroArticulos = rubroArticuloRepository.findByDenominacionContaining(filtro);
            return rubroArticulos;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<RubroArticuloManufacturado> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<RubroArticuloManufacturado> rubroArticulos = rubroArticuloRepository.findByDenominacionContaining(filtro, pageable);
            return rubroArticulos;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
