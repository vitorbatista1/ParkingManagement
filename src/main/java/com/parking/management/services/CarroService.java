package com.parking.management.services;

import org.springframework.stereotype.Service;
import java.util.List;

import com.parking.management.entities.Carro; 
import com.parking.management.repositories.CarroRepository;

@Service
public class CarroService {

    private final CarroRepository carroRepository;

    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public List<Carro> listarTodos() {
        return carroRepository.findAll();
    }
}
