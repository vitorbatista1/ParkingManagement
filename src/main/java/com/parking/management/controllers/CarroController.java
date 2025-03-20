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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import com.parking.management.response.CustomResponse;



@RestController
@RequestMapping("/api/carros")
public class CarroController {
    @Autowired
    private CarroService carroService;    

    @GetMapping
    public ResponseEntity<Object> listarTodos() {
        List<Carro> carros = carroService.listarTodos();
        if (carros.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body(new CustomResponse("Nenhum carro foi encontrado"));
        }
        return ResponseEntity.ok(carros);
    }

    @GetMapping("/{placa}")
    public ResponseEntity<Object> buscarPorPlaca(@PathVariable String placa){
        Carro carro = carroService.buscarPorPlaca(placa);
        if (carro == null) {
            
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body(new CustomResponse("Carro com placa " + placa + " não encontrado"));
        }
        return ResponseEntity.ok(carro);
    }
    

    @PostMapping
    public Carro adicionarCarro(@RequestBody Carro carro){
        return carroService.salvar(carro);
    }

    @PutMapping("/{id}")
    public Carro atualizarCarro(@PathVariable Long id, @RequestBody Carro carro){
         carro.setId(id.intValue());
        return carroService.salvar(carro);

    }

    @DeleteMapping("/{id}")
    public void excluirCarro(@PathVariable String placa) {
        Carro carro = carroService.buscarPorPlaca(placa);
        if (carro != null) {
            carroService.excluir(carro);
        }
    }

}
