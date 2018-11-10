package com.unievangelica.progwebback.dominio.nacionalidade;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.internal.NotNull;
import com.unievangelica.progwebback.dominio.produto.Produto;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "nacionalidade")
@JsonIgnoreProperties({"produtos", "hibernateLazyInitializer", "handler"})
public class Nacionalidade implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "nacionalidade_id_seq")
    @SequenceGenerator(name = "nacionalidade_id_seq", sequenceName = "nacionalidade_id_seq", allocationSize = 1)
    @Column(name = "id")
    private long id;

    @NotNull
    @Column(name = "nome")
    private String nome;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "nacionalidade")
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
}