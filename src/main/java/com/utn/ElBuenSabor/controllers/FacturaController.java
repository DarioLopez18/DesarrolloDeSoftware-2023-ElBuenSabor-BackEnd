package com.utn.ElBuenSabor.controllers;
import com.utn.ElBuenSabor.entities.Factura;
import com.utn.ElBuenSabor.services.FacturaServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/facturas")

public class FacturaController extends BaseControllerImpl<Factura, FacturaServiceImpl> {
    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String filtro){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @GetMapping("/searchPaged")
    public ResponseEntity<?> search(@RequestParam String filtro, Pageable pageable){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
        } catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @GetMapping("/searchTotalVentas")
    public ResponseEntity<?> searchTotalVentas(String desde, String hasta) {
        try {
            java.sql.Date fechaDesde = java.sql.Date.valueOf(desde);
            java.sql.Date fechaHasta = java.sql.Date.valueOf(hasta);
            return ResponseEntity.status(HttpStatus.OK).body(servicio.searchTotalVentas(fechaDesde, fechaHasta));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor, intente más tarde.\"}");
        }
    }
}