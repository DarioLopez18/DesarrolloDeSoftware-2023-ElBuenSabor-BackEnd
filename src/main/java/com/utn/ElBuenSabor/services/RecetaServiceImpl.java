package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.Receta;
import com.utn.ElBuenSabor.repositories.BaseRepository;
import com.utn.ElBuenSabor.repositories.RecetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecetaServiceImpl extends BaseServiceImpl<Receta, Long> implements RecetaService{

    @Autowired
    private RecetaRepository recetaRepository;

    public RecetaServiceImpl(BaseRepository<Receta, Long> baseRepository, RecetaRepository recetaRepository) {
        super(baseRepository);
        this.recetaRepository = recetaRepository;
    }

    @Override
    public List<Receta> search(String filtro) throws Exception {
        try{
            List<Receta> recetas = recetaRepository.findByNombreRecetaContaining(filtro);
            return recetas;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Receta> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<Receta> recetas = recetaRepository.findByNombreRecetaContaining(filtro, pageable);
            return recetas;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
