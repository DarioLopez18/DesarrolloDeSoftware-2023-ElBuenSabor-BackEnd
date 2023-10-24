package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.Cocinero;
import com.utn.ElBuenSabor.repositories.BaseRepository;
import com.utn.ElBuenSabor.repositories.CocineroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CocineroServiceImpl extends BaseServiceImpl<Cocinero, Long> implements CocineroService{

    @Autowired
    private CocineroRepository cocineroRepository;

    public CocineroServiceImpl(BaseRepository<Cocinero, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Cocinero> search(String filtro) throws Exception {
        try{
            //List<Cocinero> cocineros = cocineroRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
            //List<Cocinero> cocineros = cocineroRepository.search(filtro);
            List<Cocinero> cocineros = cocineroRepository.searchNativo(filtro);
            return cocineros;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Cocinero> search(String filtro, Pageable pageable) throws Exception {
        try{
            //Page<Cocinero> cocineros = CocineroRepositoryRepository.findByNombreContainingOrApellidoContaining(filtro, filtro, pageable);
            //Page<Cocinero> cocineros = CocineroRepositoryRepository.search(filtro, pageable);
            Page<Cocinero> cocineros = cocineroRepository.searchNativo(filtro, pageable);
            return cocineros;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
