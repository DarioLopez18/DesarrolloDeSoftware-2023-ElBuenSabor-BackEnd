package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.RubroArticulo;
import com.utn.ElBuenSabor.repositories.BaseRepository;
import com.utn.ElBuenSabor.repositories.RubroArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RubroArticuloServiceImpl extends BaseServiceImpl<RubroArticulo,Long> implements RubroArticuloService{
    @Autowired
    private RubroArticuloRepository rubroArticuloRepository;

    public RubroArticuloServiceImpl(BaseRepository<RubroArticulo,Long> baseRepository, RubroArticuloRepository rubroArticuloRepository){
        super(baseRepository);
        this.rubroArticuloRepository = rubroArticuloRepository;
    }
}
