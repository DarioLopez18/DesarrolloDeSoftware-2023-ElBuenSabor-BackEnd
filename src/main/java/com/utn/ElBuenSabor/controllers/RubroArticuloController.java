package com.utn.ElBuenSabor.controllers;

import com.utn.ElBuenSabor.entities.RubroArticulo;
import com.utn.ElBuenSabor.services.RubroArticuloServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/rubroArticulo")
public class RubroArticuloController extends BaseControllerImpl<RubroArticulo, RubroArticuloServiceImpl>{
}
