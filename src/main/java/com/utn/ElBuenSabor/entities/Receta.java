package com.utn.ElBuenSabor.entities;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "receta")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Receta extends Base {

    @NotNull
    @Column(name = "nombreReceta")
    private String nombreReceta;

    @NotNull
    @Column(name = "procedimientoReceta")
    private String procedimientoReceta;

    @NotNull
    @Column(name = "tiempoPreparacion")
    private int tiempoPreparacion;

    @NotNull
    @OneToOne()
    @JoinColumn(name = "id_articulo_manufacturado")
    private ArticuloManufacturado articuloManufacturado;

    @NotNull
    @OneToMany()
    @JoinColumn(name = "id_receta")
    private List<RecetaArticuloInsumo> recetaArticuloInsumos;
}
