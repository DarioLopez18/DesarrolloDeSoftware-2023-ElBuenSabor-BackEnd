package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.RecetaArticuloInsumo;
import com.utn.ElBuenSabor.repositories.BaseRepository;
import com.utn.ElBuenSabor.repositories.RecetaArticuloInsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RecetaArticuloInsumoServiceImpl extends BaseServiceImpl<RecetaArticuloInsumo,Long> implements RecetaArticuloInsumoService{

    @Autowired
    private RecetaArticuloInsumoRepository recetaArticuloInsumoRepository;

    public RecetaArticuloInsumoServiceImpl(BaseRepository<RecetaArticuloInsumo,Long> baseRepository,RecetaArticuloInsumoRepository recetaArticuloInsumoRepository){
        super(baseRepository);
        this.recetaArticuloInsumoRepository = recetaArticuloInsumoRepository;
    }

}
