package com.parking.management.models;

public class VeiculosModels {
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String placa;

    public VeiculosModels(int id, String marca, String modelo, int ano, String cor, String placa) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo){    
        this.modelo = modelo;
    }   

    public int getAno() {
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }
  
}
