package com.utn.ElBuenSabor.controllers;

import com.utn.ElBuenSabor.entities.Combo;
import com.utn.ElBuenSabor.services.ComboServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/combo")
public class ComboController extends BaseControllerImpl<Combo, ComboServiceImpl>{

}
