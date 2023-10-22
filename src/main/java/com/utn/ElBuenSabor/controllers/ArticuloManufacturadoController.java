package com.utn.ElBuenSabor.controllers;

import com.utn.ElBuenSabor.entities.ArticuloManufacturado;
import com.utn.ElBuenSabor.services.ArticuloManufacturadoServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/articulosManufacturados")
public class ArticuloManufacturadoController extends BaseControllerImpl<ArticuloManufacturado, ArticuloManufacturadoServiceImpl> {

        @GetMapping("/search")
        public ResponseEntity<?> search(@RequestParam String filtro){
            try {
                return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
            }
        }

        @GetMapping("/searchPaged")
        public ResponseEntity<?> search(@RequestParam String filtro, Pageable pageable){
            try {
                return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro, pageable));
            } catch (Exception e) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
            }
        }
}
