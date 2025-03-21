package com.parking.management.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parking.management.response.CustomResponse;





@RestController
@RequestMapping("/api/empresas")
public class EmpresaController {
    @Autowired
    private EmpresaService empresaService;

    @GetMapping
    public ResponseEntity<Object> listarTodos() {
        List<Empresa> empresas = empresaService.listarTodos();
        if (empresas.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                                 .body(new CustomResponse("Nenhuma empresa foi encontrada"));
        }
        return ResponseEntity.ok(empresas);
    }

    
}
