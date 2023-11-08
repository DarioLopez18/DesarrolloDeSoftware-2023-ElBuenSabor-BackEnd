package com.utn.ElBuenSabor.repositories;

import com.utn.ElBuenSabor.entities.Factura;
import com.utn.ElBuenSabor.entities.Pedido;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRepository extends BaseRepository<Pedido,Long> {

    List<Pedido> findByIdContaining(Long id);

    Page<Pedido> findByIdContaining(Long id, Pageable pageable);
    //Anotacion JPQL parametros nombrados
    @Query(value = "SELECT p FROM Pedido p WHERE p.id LIKE %:filtro%")
    List<Pedido> search(@Param("filtro") Long filtro);

    @Query(value = "SELECT p FROM Pedido p WHERE p.id LIKE %:filtro%")
    Page<Pedido> search(@Param("filtro") Long filtro, Pageable pageable);

    @Query(value = "SELECT * FROM Pedido p WHERE p.id_cliente = :id",nativeQuery = true)
    List<Pedido> pedidosRealizadosCliente(@Param("id") Long id);

    @Query(value = "SELECT * FROM Pedido p WHERE p.estado = :nombreEstado",nativeQuery = true)
    List<Pedido> pedidosConEstado(@Param("nombreEstado") String nombreEstado);

}
