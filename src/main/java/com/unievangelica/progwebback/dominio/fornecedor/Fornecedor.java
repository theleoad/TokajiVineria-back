package com.unievangelica.progwebback.dominio.fornecedor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.internal.NotNull;
import com.unievangelica.progwebback.dominio.produto.Produto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "fornecedor")
@JsonIgnoreProperties({"produtos", "hibernateLazyInitializer", "handler"})
public class Fornecedor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fornecedor_id_seq")
    @SequenceGenerator(name = "fornecedor_id_seq", sequenceName = "fornecedor_id_seq", allocationSize = 1)
    @Column(name = "id")
    private long id;

    @NotNull
    @Column(name = "nome")
    private String nome;

    @NotNull
    @Column(name = "razaosocial")
    private String razaosocial;

    @NotNull
    @Column(name = "cnpj")
    private Integer cnpj;

    @NotNull
    @Column(name = "ie")
    private Integer ie;

    @NotNull
    @Column(name = "endereco")
    private String endereco;

    @NotNull
    @Column(name = "bairro")
    private String bairro;

    @NotNull
    @Column(name = "cidade")
    private String cidade;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "fornecedor")
    private List<Produto> produtos;


    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

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

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getIe() {
        return ie;
    }

    public void setIe(Integer ie) {
        this.ie = ie;
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