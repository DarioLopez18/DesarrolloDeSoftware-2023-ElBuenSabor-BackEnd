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
    private AdministradorRepository administradorRepository;

    public AdministradorServiceImpl(BaseRepository<Administrador, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    public List<Administrador> search(String filtro) throws Exception {
        try{
            //List<Administrador> administradores = administradorRepository.findByNombreContainingOrApellidoContaining(filtro, filtro);
            //List<Administrador> administradores = administradorRepository.search(filtro);
            List<Administrador> administradores = administradorRepository.searchNativo(filtro);
            return administradores;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Administrador> search(String filtro, Pageable pageable) throws Exception {
        try{
            //Page<Administrador> administradores = administradorRepository.findByNombreContainingOrApellidoContaining(filtro, filtro, pageable);
            //Page<Administrador> administradores = administradorRepository.search(filtro, pageable);
            Page<Administrador> administradores = administradorRepository.searchNativo(filtro, pageable);
            return administradores;

        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
