package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.Administrador;
import com.utn.ElBuenSabor.repositories.BaseRepository;
import com.utn.ElBuenSabor.repositories.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministradorServiceImpl extends BaseServiceImpl<Administrador, Long> implements AdministradorService{

    @Autowired
    private AdministradorRepository clienteRepository;

    public AdministradorServiceImpl(BaseRepository<Administrador, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Administrador> search(String filtro) throws Exception {
        try{
            //List<Administrador> clientes = clienteRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
            //List<Administrador> clientes = clienteRepository.search(filtro);
            List<Administrador> clientes = clienteRepository.searchNativo(filtro);
            return clientes;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Administrador> search(String filtro, Pageable pageable) throws Exception {
        try{
            //Page<Administrador> clientes = clienteRepository.findByNombreContainingOrApellidoContaining(filtro, filtro, pageable);
            //Page<Administrador> clientes = clienteRepository.search(filtro, pageable);
            Page<Administrador> clientes = clienteRepository.searchNativo(filtro, pageable);
            return clientes;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
