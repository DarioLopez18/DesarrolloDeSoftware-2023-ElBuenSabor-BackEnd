package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.Receta;
import com.utn.ElBuenSabor.entities.RubroArticulo;
import com.utn.ElBuenSabor.repositories.BaseRepository;
import com.utn.ElBuenSabor.repositories.RubroArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RubroArticuloServiceImpl extends BaseServiceImpl<RubroArticulo,Long> implements RubroArticuloService{
    @Autowired
    private RubroArticuloRepository rubroArticuloRepository;

    public RubroArticuloServiceImpl(BaseRepository<RubroArticulo,Long> baseRepository, RubroArticuloRepository rubroArticuloRepository){
        super(baseRepository);
        this.rubroArticuloRepository = rubroArticuloRepository;
    }

    @Override
    public List<RubroArticulo> search(String filtro) throws Exception {
        try{
            List<RubroArticulo> rubroArticulos = rubroArticuloRepository.findByDenominacionContaining(filtro);
            return rubroArticulos;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<RubroArticulo> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<RubroArticulo> rubroArticulos = rubroArticuloRepository.findByDenominacionContaining(filtro, pageable);
            return rubroArticulos;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
