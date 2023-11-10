package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.dtos.DTOCambiarContraseña;
import com.utn.ElBuenSabor.entities.Usuario;
import com.utn.ElBuenSabor.repositories.BaseRepository;
import com.utn.ElBuenSabor.repositories.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl extends BaseServiceImpl<Usuario,Long> implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(BaseRepository<Usuario, Long> baseRepository, UsuarioRepository usuarioRepository) {
        super(baseRepository);
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public List<Usuario> search(String username, String password) throws Exception {
        try {
            List<Usuario> entities = usuarioRepository.searchNativo(username, password);
            return entities;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public boolean cambiarContrasena(DTOCambiarContraseña dtoCambiarContraseña) throws Exception{
        try{
            Usuario usuario = usuarioRepository.getReferenceById(dtoCambiarContraseña.getId());
            if (usuario.getPassword().equals(dtoCambiarContraseña.getContraseniaActual())) {
                usuarioRepository.cambiarContrasena(dtoCambiarContraseña.getId(), dtoCambiarContraseña.getContraseniaNueva());

                return true;
            }else{
                return false;
            }
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

}