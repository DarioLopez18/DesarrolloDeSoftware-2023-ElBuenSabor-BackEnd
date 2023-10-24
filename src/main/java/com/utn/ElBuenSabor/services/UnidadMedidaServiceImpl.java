package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.UnidadMedida;
import com.utn.ElBuenSabor.repositories.BaseRepository;
import com.utn.ElBuenSabor.repositories.UnidadMedidaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnidadMedidaServiceImpl extends BaseServiceImpl<UnidadMedida,Long> implements UnidadMedidaService{
    @Autowired
    private UnidadMedidaRepository unidadMedidaRepository;

    public UnidadMedidaServiceImpl(BaseRepository<UnidadMedida,Long> baseRepository,UnidadMedidaRepository unidadMedidaRepository){
        super(baseRepository);
        this.unidadMedidaRepository = unidadMedidaRepository;
    }
}
