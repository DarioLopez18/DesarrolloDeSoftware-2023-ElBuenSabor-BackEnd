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
    private CocineroRepository clienteRepository;

    public CocineroServiceImpl(BaseRepository<Cocinero, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Cocinero> search(String filtro) throws Exception {
        try{
            //List<Cocinero> clientes = clienteRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
            //List<Cocinero> clientes = clienteRepository.search(filtro);
            List<Cocinero> clientes = clienteRepository.searchNativo(filtro);
            return clientes;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Cocinero> search(String filtro, Pageable pageable) throws Exception {
        try{
            //Page<Cocinero> clientes = clienteRepository.findByNombreContainingOrApellidoContaining(filtro, filtro, pageable);
            //Page<Cocinero> clientes = clienteRepository.search(filtro, pageable);
            Page<Cocinero> clientes = clienteRepository.searchNativo(filtro, pageable);
            return clientes;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
