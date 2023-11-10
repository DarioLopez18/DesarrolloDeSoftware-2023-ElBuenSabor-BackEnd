package com.utn.ElBuenSabor.controllers;

import com.utn.ElBuenSabor.entities.DetallePedido;
import com.utn.ElBuenSabor.services.DetallePedidoComboServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/detallePedidoCombo")
public class DetallePedidoComboController extends BaseControllerImpl<DetallePedido, DetallePedidoComboServiceImpl>{
}
