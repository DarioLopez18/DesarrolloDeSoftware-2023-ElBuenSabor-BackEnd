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
public class DetallePedidoArticuloManufacturadoDTO {
    private Integer cantidad;
    private BigDecimal subTotal;
    private PedidoDTO detallePedido;
    private ArticuloManufacturadoDTO articuloManufacturadoDTO;
}
