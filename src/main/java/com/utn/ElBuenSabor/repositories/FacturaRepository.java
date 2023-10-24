package com.utn.ElBuenSabor.repositories;

import com.utn.ElBuenSabor.entities.Factura;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FacturaRepository extends BaseRepository<Factura,Long>{

    List<Factura> findByIdContaining(Long id);

    Page<Factura> findByIdContaining(Long id, Pageable pageable);
    //Anotacion JPQL parametros nombrados
    @Query(value = "SELECT f FROM Factura f WHERE f.id LIKE %:filtro%")
    List<Factura> search(@Param("filtro") Long filtro);

    @Query(value = "SELECT f FROM Factura f WHERE f.id LIKE %:filtro%")
    Page<Factura> search(@Param("filtro") Long filtro, Pageable pageable);

}
