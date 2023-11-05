package com.utn.ElBuenSabor.dtos;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
@Setter
@Getter
@EqualsAndHashCode(callSuper=false)
@Data
public class DetallePedidoComboDTO extends GenericoDTO{
    private Integer cantidad;
    private BigDecimal subtotal;
    private ComboDTO combo;
    private PedidoDTO pedido;
}
