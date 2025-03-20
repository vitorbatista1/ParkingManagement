package com.parking.management.entities;

import jakarta.persistence.*; // Corrigido para importar as anotações corretas do JPA

@Entity
@Table(name = "carro") // Define a tabela no banco de dados
public class Carro { 
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false) // Define que não pode ser nulo
    private String marca;

    @Column(nullable = false)
    private String modelo;

    private int ano;
    private String cor;

    // Construtor padrão necessário para JPA
    public Carro() {}

    // Construtor com parâmetros
    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
