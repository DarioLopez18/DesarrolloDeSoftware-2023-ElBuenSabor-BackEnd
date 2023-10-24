package com.utn.ElBuenSabor.services;

import com.utn.ElBuenSabor.entities.Combo;
import com.utn.ElBuenSabor.repositories.BaseRepository;
import com.utn.ElBuenSabor.repositories.ComboRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComboServiceImpl extends BaseServiceImpl<Combo,Long> implements ComboService{
    @Autowired
    private ComboRepository comboRepository;

    public ComboServiceImpl(BaseRepository<Combo,Long> baseRepository,ComboRepository comboRepository){
        super(baseRepository);
        this.comboRepository = comboRepository;
    }
}
