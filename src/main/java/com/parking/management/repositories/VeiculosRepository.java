package com.parking.management.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import com.parking.management.entities.Veiculos;

@Repository
public interface VeiculosRepository extends JpaRepository<Veiculos, Long> {
    Optional<Veiculos> findByPlaca(String placa);
}