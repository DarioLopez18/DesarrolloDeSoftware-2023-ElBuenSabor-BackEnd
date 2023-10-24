package com.utn.ElBuenSabor.repositories;

import com.utn.ElBuenSabor.entities.Receta;
import com.utn.ElBuenSabor.entities.RubroArticulo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RubroArticuloRepository extends BaseRepository<RubroArticulo,Long>{
    List<RubroArticulo> findByDenominacionContaining(String denominacion);

    Page<RubroArticulo> findByDenominacionContaining(String denominacion, Pageable pageable);
    //Anotacion JPQL parametros nombrados
    @Query(value = "SELECT r FROM RubroArticulo r WHERE r.denominacion LIKE %:filtro%")
    List<RubroArticulo> search(@Param("filtro") String filtro);

    @Query(value = "SELECT r FROM RubroArticulo r WHERE r.denominacion LIKE %:filtro%")
    Page<RubroArticulo> search(@Param("filtro") String filtro, Pageable pageable);
}
