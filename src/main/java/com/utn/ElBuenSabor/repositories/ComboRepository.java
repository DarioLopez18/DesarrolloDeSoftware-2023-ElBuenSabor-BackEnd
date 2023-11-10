package com.utn.ElBuenSabor.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComboRepository extends BaseRepository<Combo,Long>{

    List<Combo> findByNombreComboContaining(String nombreCombo);

    Page<Combo> findByNombreComboContaining(String nombreCombo, Pageable pageable);
    //Anotacion JPQL parametros nombrados
    @Query(value = "SELECT c FROM Combo c WHERE c.nombreCombo LIKE %:filtro%")
    List<Combo> search(@Param("filtro") String filtro);

    @Query(value = "SELECT c FROM Combo c WHERE c.nombreCombo LIKE %:filtro%")
    Page<Combo> search(@Param("filtro") String filtro, Pageable pageable);
}
