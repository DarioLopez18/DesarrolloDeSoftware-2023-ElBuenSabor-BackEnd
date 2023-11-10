package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.repositories.BaseRepository;
import com.utn.ElBuenSabor.repositories.RubroArticuloInsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecetaArticuloInsumoServiceImpl extends BaseServiceImpl<RubroArticuloInsumo,Long> implements RecetaArticuloInsumoService{

    @Autowired
    private RubroArticuloInsumoRepository recetaArticuloInsumoRepository;

    public RecetaArticuloInsumoServiceImpl(BaseRepository<RubroArticuloInsumo,Long> baseRepository, RubroArticuloInsumoRepository recetaArticuloInsumoRepository){
        super(baseRepository);
        this.recetaArticuloInsumoRepository = recetaArticuloInsumoRepository;
    }

}
