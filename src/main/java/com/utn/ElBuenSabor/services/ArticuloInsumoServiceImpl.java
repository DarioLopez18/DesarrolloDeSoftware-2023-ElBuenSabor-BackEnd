package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.ArticuloInsumo;
import com.utn.ElBuenSabor.entities.Cliente;
import com.utn.ElBuenSabor.repositories.ArticuloInsumoRepository;
import com.utn.ElBuenSabor.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticuloInsumoServiceImpl extends BaseServiceImpl<ArticuloInsumo, Long> implements ArticuloInsumoService{
    @Autowired
    private ArticuloInsumoRepository articuloInsumoRepository;

    public ArticuloInsumoServiceImpl(BaseRepository<ArticuloInsumo, Long> baseRepository, ArticuloInsumoRepository articuloInsumoRepository) {
        super(baseRepository);
        this.articuloInsumoRepository = articuloInsumoRepository;
    }

    @Override
    public List<ArticuloInsumo> search(String filtro) throws Exception {
        try{
            List<ArticuloInsumo> articuloInsumos = articuloInsumoRepository.findByDenominacionContaining(filtro);
            return articuloInsumos;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<ArticuloInsumo> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<ArticuloInsumo> articuloInsumos = articuloInsumoRepository.findByDenominacionContaining(filtro, pageable);
            return articuloInsumos;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public List<ArticuloInsumo> articulosConBajoStock(int stockMinimo) throws Exception {
        try{
            List<ArticuloInsumo> articuloInsumos = articuloInsumoRepository.articulosConBajoStock(stockMinimo);
            return articuloInsumos;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
