package com.utn.ElBuenSabor.controllers;

import com.utn.ElBuenSabor.entities.Pedido;
import com.utn.ElBuenSabor.services.PedidoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/pedido")
public class PedidoController extends BaseControllerImpl<Pedido, PedidoServiceImpl>{
}
