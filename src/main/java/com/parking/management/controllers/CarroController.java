package com.parking.management.controllers;

import java.util.List;
import com.parking.management.entities.Carro;
import com.parking.management.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/carros")
public class CarroController {
    
    @Autowired
    private CarroService carroService;    

    @GetMapping
    public ResponseEntity<List<Carro>> listarTodos() {
        List<Carro> carros = carroService.listarTodos();
        if (carros.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(carros);
    }

    @GetMapping("/{placa}")
    public ResponseEntity<Carro> buscarPorPlaca(@PathVariable String placa){
        Carro carro = carroService.buscarPorPlaca(placa);
        if (carro == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(carro);
    }

    @PostMapping
    public ResponseEntity<Carro> adicionarCarro(@RequestBody Carro carro){
        Carro carroSalvo = carroService.salvar(carro);
        return ResponseEntity.status(201).body(carroSalvo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Carro> atualizarCarro(@PathVariable Long id, @RequestBody Carro carro){
        carro.setId(id.intValue());
        Carro carroAtualizado = carroService.salvar(carro);
        return ResponseEntity.ok(carroAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirCarro(@PathVariable String placa) {
        Carro carro = carroService.buscarPorPlaca(placa);
        if (carro != null) {
            carroService.excluir(carro);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
