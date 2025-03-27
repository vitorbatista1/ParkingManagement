package com.parking.management.models;

public class EmpresaModels {
    private int id;
    private String nome;
    private String cnpj;
    private String endereco;
    private String telefone;
    private String qtdVagasParaMotos;
    private String qtdVagasParaCarros;

    public EmpresaModels(int id, String nome, String cnpj, String endereco, String telefone, String qtdVagasParaMotos, String qtdVagasParaCarros) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.qtdVagasParaMotos = qtdVagasParaMotos;
        this.qtdVagasParaCarros = qtdVagasParaCarros;
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

    public String getQtdVagasParaMotos() {
        return qtdVagasParaMotos;
    }
    
    public void setQtdVagasParaMotos(String qtdVagasParaMotos) {
        this.qtdVagasParaMotos = qtdVagasParaMotos;
    }
    
    public String getQtdVagasParaCarros() {
        return qtdVagasParaCarros;
    }
    
    public void setQtdVagasParaCarros(String qtdVagasParaCarros) {
        this.qtdVagasParaCarros = qtdVagasParaCarros;
    }   
    
    
}

