package com.utn.ElBuenSabor.controllers;

import com.utn.ElBuenSabor.entities.Cliente;
import com.utn.ElBuenSabor.services.ClienteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/cliente")
public class ClienteController extends BaseControllerImpl<Cliente, ClienteServiceImpl>{
}
