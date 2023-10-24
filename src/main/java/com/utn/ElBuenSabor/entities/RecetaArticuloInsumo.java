package com.utn.ElBuenSabor.entities;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name = "pedido")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class RecetaArticuloInsumo extends Base{

    @NotNull
    @Column(name = "cantidad")
    private int cantidad;

    @NotNull
    @JoinColumn(name = "receta_articulo_insumo")
    @ManyToOne()
    private Receta recetaArticuloInsumo;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "id_articuloInsumo")
    private ArticuloInsumo articuloInsumo;
}
