package com.utn.ElBuenSabor.entities;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@Entity
@Table(name = "articulo_manufacturado_combo")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class ArticuloManufacturadoCombo extends Base{
    @NotNull
    @Column(name = "fecha_hora_desde")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraDesde;

    @NotNull
    @Column(name = "fecha_hora_hasta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHoraHasta;

    @NotNull
    @ManyToOne()
    @JoinColumn(name = "id_articulo_manufacturado")
    private ArticuloManufacturado articuloManufacturado;

    /* ESTA RELACION SE MAPEA EN COMBO
    @NotNull
    @ManyToOne()
    @JoinColumn(name = "id_combo")
    private Combo articuloManufacturadoCombo;
     */

}
