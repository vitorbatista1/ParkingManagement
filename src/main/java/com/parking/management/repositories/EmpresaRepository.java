package com.parking.management.repositories;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.parking.management.entities.Empresa;

@Repository
public class EmpresaRepository extends JpaRepository<Empresa, Integer> {
    Optional<Empresa> findByCnpj(String cnpj);
    
}
