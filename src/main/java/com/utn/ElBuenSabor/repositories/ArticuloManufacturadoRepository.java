package com.utn.ElBuenSabor.repositories;

import com.utn.ElBuenSabor.entities.ArticuloManufacturado;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticuloManufacturadoRepository extends BaseRepository<ArticuloManufacturado,Long>{
    List<ArticuloManufacturado> findByDenominacionContaining(String nombre);

    Page<ArticuloManufacturado> findByDenominacionContaining(String nombre, Pageable pageable);

    //Anotacion JPQL
    @Query(value = "SELECT a FROM ArticuloManufacturado a WHERE a.denominacion LIKE %:filtro%")
    List<ArticuloManufacturado> search(@Param("filtro") String filtro);

    @Query(value = "SELECT a FROM ArticuloManufacturado a WHERE a.denominacion LIKE %:filtro%")
    Page<ArticuloManufacturado> search(@Param("filtro") String filtro, Pageable pageable);

    @Query(value = "SELECT * FROM ArticuloManufacturado WHERE fechaBaja = false",
    nativeQuery = true)
    List<ArticuloManufacturado> listarArticulosManufacturados();
}
