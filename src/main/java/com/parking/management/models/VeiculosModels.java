package com.parking.management.models;

public class VeiculosModels {
    private int id;
    private String marca;
    private String modelo;
    private String cor;
    private String placa;
    private String tipo;

    public VeiculosModels(int id, String marca, String modelo, String cor, String placa, String tipo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.placa = placa;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
  
}
