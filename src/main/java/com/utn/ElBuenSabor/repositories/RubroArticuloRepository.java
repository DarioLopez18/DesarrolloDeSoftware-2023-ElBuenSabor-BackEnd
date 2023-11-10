package com.utn.ElBuenSabor.repositories;

import com.utn.ElBuenSabor.entities.Receta;
import com.utn.ElBuenSabor.entities.RubroArticuloManufacturado;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RubroArticuloRepository extends BaseRepository<RubroArticuloManufacturado,Long>{
    List<RubroArticuloManufacturado> findByDenominacionContaining(String denominacion);

    Page<RubroArticuloManufacturado> findByDenominacionContaining(String denominacion, Pageable pageable);
    //Anotacion JPQL parametros nombrados
    @Query(value = "SELECT r FROM RubroArticulo r WHERE r.denominacion LIKE %:filtro%")
    List<RubroArticuloManufacturado> search(@Param("filtro") String filtro);

    @Query(value = "SELECT r FROM RubroArticulo r WHERE r.denominacion LIKE %:filtro%")
    Page<RubroArticuloManufacturado> search(@Param("filtro") String filtro, Pageable pageable);
}
