package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.repositories.ArticuloManufacturadoComboRepository;
import com.utn.ElBuenSabor.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticuloManufacturadoComboServiceImpl extends BaseServiceImpl<ArticuloManufacturadoCombo,Long> {
    @Autowired
    private ArticuloManufacturadoComboRepository articuloManufacturadoComboRepository;

    public ArticuloManufacturadoComboServiceImpl(BaseRepository<ArticuloManufacturadoCombo,Long> baseRepository, ArticuloManufacturadoComboRepository articuloManufacturadoComboRepository){
        super(baseRepository);
        this.articuloManufacturadoComboRepository = articuloManufacturadoComboRepository;
    }
}
