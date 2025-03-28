package com.parking.management.models;

public class EmpresaModels {
    private int id;
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;
    private Long vagas_motos;
    private Long vagas_carros;

    public EmpresaModels(int id, String nome, String cnpj, String endereco, String telefone, Long vagas_motos, Long vagas_carros) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.vagas_motos = vagas_motos;
        this.vagas_carros = vagas_carros;
    }

    public int getId() {   
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }   

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Long getQtdVagasParaMotos() {
        return vagas_motos;
    }
    
    public void setQtdVagasParaMotos(Long vagas_motos) {
        this.vagas_motos = vagas_motos;
    }
    
    public Long getQtdVagasParaCarros() {
        return vagas_carros;
    }
    
    public void setQtdVagasParaCarros(Long vagas_carros) {
        this.vagas_carros = vagas_carros;
    }   
    
    
}

