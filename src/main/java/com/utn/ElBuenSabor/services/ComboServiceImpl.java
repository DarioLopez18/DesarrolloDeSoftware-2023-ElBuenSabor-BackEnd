package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComboServiceImpl extends BaseServiceImpl<Combo,Long> implements ComboService{
    @Autowired
    private ComboRepository comboRepository;

    public ComboServiceImpl(BaseRepository<Combo,Long> baseRepository,ComboRepository comboRepository){
        super(baseRepository);
        this.comboRepository = comboRepository;
    }

    @Override
    public List<Combo> search(String filtro) throws Exception {
        try{
            List<Combo> combos = comboRepository.findByNombreComboContaining(filtro);
            return combos;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Combo> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<Combo> combos = comboRepository.findByNombreComboContaining(filtro, pageable);
            return combos;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
}
