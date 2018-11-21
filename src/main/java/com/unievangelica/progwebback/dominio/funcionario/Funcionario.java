package com.unievangelica.progwebback.dominio.funcionario;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.internal.NotNull;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "funcionario")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Funcionario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "funcionario_id_seq")
    @SequenceGenerator(name = "funcionario_id_seq", sequenceName = "funcionario_id_seq", allocationSize = 1)
    @Column(name = "id")
    private long id;

    @NotNull
    @Column(name = "nome")
    private String nome;

    @NotNull
    @Column(name = "cpf")
    private String cpf;

    @NotNull
    @Column(name = "rg")
    private String rg;

    @NotNull
    @Column(name = "endereco")
    private String endereco;

    @NotNull
    @Column(name = "bairro")
    private String bairro;

    @NotNull
    @Column(name = "cidade")
    private String cidade;

    // GET & SET

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

}