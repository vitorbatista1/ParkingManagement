package com.parking.management.controllers;
import java.util.List;
import com.parking.management.entities.Carro;
import com.parking.management.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.http.ResponseEntity;


@RestController
@RequestMapping("/api/carros")
public class CarroController {
    @Autowired
    private CarroService carroService;    

    @GetMapping
    public ResponseEntity<List<Carro>> listarTodos() {
        return ResponseEntity.ok(carroService.listarTodos());
    }
}
