package com.utn.ElBuenSabor.entities;

import com.utn.ElBuenSabor.enums.CategoriaProducto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "articulo_manufacturado")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class ArticuloManufacturado extends Base {

    @NotNull
    private String denominacion;

    @NotNull
    private CategoriaProducto categoria;

    @NotNull
    @Column(length = 1000)
    private String descripcion;

    @NotNull
    @Column(name = "tiempo_estimado_cocina")
    private Integer tiempoEstimadoCocina;

    @NotNull
    @Column(name = "precio_venta", precision = 10, scale = 2)
    private BigDecimal precioVenta;

    @Column(name = "costo", precision = 10, scale = 2)
    private BigDecimal costo;

    @Column(length = 500, name = "url_imagen")
    private String urlImagen;

<<<<<<< HEAD
=======
    
>>>>>>> 680d68667abf76cfae73747eb095ae7c2badb6ac
    @OneToMany()
    @JoinColumn(name = "id_articulo_manufacturado")
    private List<DetalleArticuloManufacturado> detalleArticuloManufacturado;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "id_rubro_articulo_manufacturado")
    private RubroArticuloManufacturado rubroArticuloManufacturado;

    @NotNull
    @OneToOne()
    @JoinColumn(name = "id_receta")
    private Receta receta;

}
