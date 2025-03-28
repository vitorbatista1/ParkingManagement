package com.parking.management.entities;

import jakarta.persistence.*; 

@Entity
@Table(name = "estabelecimento")
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

    @Column()
    private Long vagas_motos;

    @Column()
    private Long vagas_carros;


    public Empresa() {}

    public Empresa(String nome, String cnpj, String endereco, String telefone, Long vagas_motos, Long vagas_carros) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
        this.telefone = telefone;
        this.vagas_motos = vagas_motos;
        this.vagas_carros = vagas_carros;
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
