package com.utn.ElBuenSabor.repositories;

import com.utn.ElBuenSabor.entities.ArticuloInsumo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ArticuloInsumoRepository extends BaseRepository<ArticuloInsumo,Long>{
    List<ArticuloInsumo> findByDenominacionContaining(String denominacion);

    Page<ArticuloInsumo> findByDenominacionContaining(String denominacion, Pageable pageable);

    @Query(value = "SELECT a FROM ArticuloInsumo a WHERE a.denominacion LIKE %:filtro%")
    List<ArticuloInsumo> search(@Param("filtro") String filtro);

    @Query(value = "SELECT a FROM ArticuloInsumo a WHERE a.denominacion LIKE %:filtro%")
    Page<ArticuloInsumo> search(@Param("filtro") String filtro, Pageable pageable);
}
