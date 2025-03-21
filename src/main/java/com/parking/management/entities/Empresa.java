package com.parking.management.entities;

import jakarta.persistence.*; 

@Entity
@Table(name = "empresas")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String cnpj;

    @Column()
    private String endereco;

    @Column()
    private String telefone;

    @Column(nullable = false)
    private String qtdVagasParaMotos;

    @Column(nullable = false)
    private String qtdVagasParaCarros;


    public Empresa() {}

    public Empresa(String nome, String cnpj, String endereco, String telefone, String qtdVagasParaMotos, String qtdVagasParaCarros) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.qtdVagasParaMotos = qtdVagasParaMotos;
        this.qtdVagasParaCarros = qtdVagasParaCarros;
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
