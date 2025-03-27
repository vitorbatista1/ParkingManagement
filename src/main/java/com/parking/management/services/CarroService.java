package com.parking.management.services;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.parking.management.entities.Veiculos; 
import com.parking.management.repositories.VeiculosRepository;

@Service
public class CarroService {

    private final VeiculosRepository carroRepository;

    public CarroService(VeiculosRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public List<Veiculos> listarTodos() {
        return carroRepository.findAll();
    }

    public Veiculos buscarPorPlaca(String placa){
        return carroRepository.findByPlaca(placa).orElse(null);
    }

    public Veiculos buscarPorId(Long id){
        return carroRepository.findById(id).orElse(null);

    }
    
    public Veiculos salvar(Veiculos carro){
        return carroRepository.save(carro);
    }

    public Optional<Veiculos> atualizarVeiculo(Long id, Veiculos veiculoAtualizado) {
        return carroRepository.findById(id)
                .map(veiculoExistente -> {
                    veiculoExistente.setMarca(veiculoAtualizado.getMarca());
                    veiculoExistente.setModelo(veiculoAtualizado.getModelo());
                    veiculoExistente.setCor(veiculoAtualizado.getCor());
                    veiculoExistente.setPlaca(veiculoAtualizado.getPlaca());
                    veiculoExistente.setTipo(veiculoAtualizado.getTipo());
                    return carroRepository.save(veiculoExistente);
                });
    }
    public boolean excluir(Long id) {
        return carroRepository.findById(id)
                .map(veiculo -> {
                    carroRepository.delete(veiculo);
                    return true;
                })
                .orElse(false);
    }

    
}
