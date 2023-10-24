package com.utn.ElBuenSabor.repositories;

import com.utn.ElBuenSabor.entities.Cocinero;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CocineroRepository extends BaseRepository<Cocinero,Long> {

    //Anotacion Metodo de Query

    List<Cocinero> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    Page<Cocinero> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);

    //Anotacion JPQL parametros indexados
    /*@Query(value = "SELECT p FROM Cocinero p WHERE p.nombre LIKE '%?1%' OR p.apellido LIKE '%?1%'")
    List<Cocinero> search(String filtro);*/

    //Anotacion JPQL parametros nombrados
    @Query(value = "SELECT p FROM Cocinero p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    List<Cocinero> search(@Param("filtro") String filtro);

    @Query(value = "SELECT p FROM Cocinero p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    Page<Cocinero> search(@Param("filtro") String filtro, Pageable pageable);

    //Nativas
    @Query(
            value = "SELECT * FROM cliente WHERE cliente.nombre LIKE %:filtro% OR cliente.apellido LIKE %:filtro%",
            nativeQuery = true
    )
    List<Cocinero> searchNativo(@Param("filtro") String filtro);

    @Query(
            value = "SELECT * FROM cliente WHERE cliente.nombre LIKE %:filtro% OR cliente.apellido LIKE %:filtro%",
            countQuery = "SELECT count (*) FROM cliente",
            nativeQuery = true
    )
    Page<Cocinero> searchNativo(@Param("filtro") String filtro, Pageable pageable);
}
