package com.utn.ElBuenSabor.repositories;

import com.utn.ElBuenSabor.entities.Delivery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeliveryRepository extends BaseRepository<Delivery,Long> {

    //Anotacion Metodo de Query

    List<Delivery> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    Page<Delivery> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);

    //Anotacion JPQL parametros indexados
    /*@Query(value = "SELECT p FROM Delivery p WHERE p.nombre LIKE '%?1%' OR p.apellido LIKE '%?1%'")
    List<Delivery> search(String filtro);*/

    //Anotacion JPQL parametros nombrados
    @Query(value = "SELECT p FROM Delivery p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    List<Delivery> search(@Param("filtro") String filtro);

    @Query(value = "SELECT p FROM Delivery p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    Page<Delivery> search(@Param("filtro") String filtro, Pageable pageable);

    //Nativas
    @Query(
            value = "SELECT * FROM cliente WHERE cliente.nombre LIKE %:filtro% OR cliente.apellido LIKE %:filtro%",
            nativeQuery = true
    )
    List<Delivery> searchNativo(@Param("filtro") String filtro);

    @Query(
            value = "SELECT * FROM cliente WHERE cliente.nombre LIKE %:filtro% OR cliente.apellido LIKE %:filtro%",
            countQuery = "SELECT count (*) FROM cliente",
            nativeQuery = true
    )
    Page<Delivery> searchNativo(@Param("filtro") String filtro, Pageable pageable);
}
