package com.utn.ElBuenSabor.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UnidadMedidaRepository extends BaseRepository<UnidadMedida,Long>{
    List<UnidadMedida> findByDenominacionContaining(String denominacion);

    Page<UnidadMedida> findByDenominacionContaining(String denominacion, Pageable pageable);

    @Query(value = "SELECT u FROM UnidadMedida u WHERE u.denominacion LIKE %:filtro%")
    List<UnidadMedida> search(@Param("filtro") String filtro);

    @Query(value = "SELECT u FROM UnidadMedida u WHERE u.denominacion LIKE %:filtro%")
    Page<UnidadMedida> search(@Param("filtro") String filtro, Pageable pageable);
}
