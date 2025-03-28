package com.parking.management.controllers;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import com.parking.management.entities.Empresa;
import com.parking.management.services.EmpresaService;
import com.parking.management.response.CustomResponse;

@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {

    private final EmpresaService empresaService;

    // Injeção de dependência via construtor
    public EmpresaController(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @PostMapping
    public ResponseEntity<CustomResponse<Empresa>> adicionarEmpresa(@RequestBody Empresa empresa) {
        Empresa empresaSalva = empresaService.adicionarEmpresa(empresa);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new CustomResponse<>("Empresa adicionada com sucesso", empresaSalva));
    }

    @GetMapping
    public ResponseEntity<CustomResponse<List<Empresa>>> listarTodos() {
        List<Empresa> empresas = empresaService.listarTodos();
        if (empresas.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new CustomResponse<>("Nenhuma empresa foi encontrada"));
        }
        return ResponseEntity.ok(new CustomResponse<>("Empresas listadas com sucesso", empresas));
    }
}