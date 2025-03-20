package com.parking.management.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import com.parking.management.entities.Carro; 
import com.parking.management.repositories.CarroRepository;

@Service
public class CarroService {

    @Autowired
    private final CarroRepository carroRepository;

    public List<Carro> listarTodos() {
        return carroRepository.findAll();
    }

    public Carro buscarPorPlaca(String placa){
        return carroRepository.findByPlaca(placa).orElse(null);
    }
    
    public Carro salvar(Carro carro){
        return carroRepository.save(carro);
    }

    public void excluir(Carro carro){
        carroRepository.delete(carro);
    }
}
