package com.parking.management.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parking.management.entities.Empresa;
import com.parking.management.repositories.EmpresaRepository;

@Service
public class EmpresaService {
    
    @Autowired
    private EmpresaRepository empresaRepository;

    public EmpresaService(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    public List<Empresa> listarTodos() {
        return empresaRepository.findAll();
    }

    public Empresa buscarPorCnpj(String cnpj) {
        return empresaRepository.findByCnpj(cnpj).orElse(null);
    }

}
