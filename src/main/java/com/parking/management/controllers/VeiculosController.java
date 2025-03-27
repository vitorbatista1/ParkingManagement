package com.parking.management.controllers;

import java.util.List;
import com.parking.management.entities.Veiculos;
import com.parking.management.services.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.parking.management.response.CustomResponse;

@RestController
@RequestMapping("/api/carros")
public class VeiculosController {

    @Autowired
    private CarroService carroService;    

    @GetMapping
    public ResponseEntity<CustomResponse<List<Veiculos>>> listarTodos() {
        List<Veiculos> carros = carroService.listarTodos();
        if (carros.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new CustomResponse<>("Nenhum carro foi encontrado"));
        }
        return ResponseEntity.ok(new CustomResponse<>("Carros encontrados com sucesso", carros));
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomResponse<Veiculos>> buscarPorId(@PathVariable Long id) {
        Veiculos carro = carroService.buscarPorId(id);
        if (carro == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new CustomResponse<>("Carro com placa " + id + " não encontrado"));
        }
        return ResponseEntity.ok(new CustomResponse<>("Carro encontrado com sucesso", carro));
    }

    @PostMapping
    public ResponseEntity<CustomResponse<Veiculos>> adicionarCarro(@RequestBody Veiculos carro) {
        Veiculos carroSalvo = carroService.salvar(carro);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new CustomResponse<>("Carro adicionado com sucesso", carroSalvo));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomResponse<Veiculos>> atualizarVeiculo(
            @PathVariable Long id, 
            @RequestBody Veiculos veiculoAtualizado) {
        
        return carroService.atualizarVeiculo(id, veiculoAtualizado)
                .map(veiculo -> ResponseEntity.ok(new CustomResponse<>("Veículo atualizado com sucesso", veiculo)))
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND)
                        .body(new CustomResponse<>("Veículo com id " + id + " não encontrado")));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CustomResponse<Void>> excluirVeiculo(@PathVariable Long id) {
        if (carroService.excluir(id)) {
            return ResponseEntity.ok(new CustomResponse<>("Veículo excluído com sucesso"));
        }
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(new CustomResponse<>("Veículo com id " + id + " não encontrado"));
    }
}
