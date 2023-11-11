package com.utn.ElBuenSabor.controllers;


import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/usuarios")
public class UsuarioController extends BaseControllerImpl<Usuario, UsuarioServiceImpl> {

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String username, String password) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(username, password));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error, por favor intente más tarde.\"}");
        }
    }

    @PutMapping("/cambiarContraseña")
    public ResponseEntity<?> search(@RequestBody DTOCambiarContraseña dtoCambiarContraseña) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.cambiarContrasena(dtoCambiarContraseña));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"error\":\"Error. Por favor, intente más tarde.\"}");
        }
    }

}