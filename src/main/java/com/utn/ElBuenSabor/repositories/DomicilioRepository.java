package com.utn.ElBuenSabor.repositories;

import com.utn.ElBuenSabor.entities.Domicilio;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DomicilioRepository extends BaseRepository<Domicilio,Long>{

    List<Domicilio> findByCalleContaining(String calle);

    Page<Domicilio> findByCalleContaining(String calle, Pageable pageable);

    @Query(value = "SELECT d FROM Domicilio d WHERE d.calle LIKE %:filtro%")
    List<Domicilio> search(@Param("filtro") String filtro);

    @Query(value = "SELECT d FROM Domicilio d WHERE d.calle LIKE %:filtro%")
    Page<Domicilio> search(@Param("filtro") String filtro, Pageable pageable);

}
