package br.com.industriaisneves.vagasemprego.apis.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
//é um Design Pattern onde os dados são obtidos do banco de dados e ocorre também a regra de negócio.
// Este retorna as Entidades (classes anotadas com @Entity).
public class Funcionario {
    @Id
    private Long id;
    private String nome;
    private String departamento;
    private String cpf;
    private String telefone;

    public Funcionario(Long id, String nome, String departamento, String cpf, String telefone) {
        this.id = id;
        this.nome = nome;
        this.departamento = departamento;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public Funcionario() {
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
