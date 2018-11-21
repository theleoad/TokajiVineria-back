package com.unievangelica.progwebback.dominio.produto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.internal.NotNull;
import com.unievangelica.progwebback.dominio.categoria.Categoria;
import com.unievangelica.progwebback.dominio.nacionalidade.Nacionalidade;
import com.unievangelica.progwebback.dominio.harmonizacao.Harmonizacao;
import com.unievangelica.progwebback.dominio.fornecedor.Fornecedor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "produto")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produto_id_seq")
    @SequenceGenerator(name = "produto_id_seq", sequenceName = "produto_id_seq", allocationSize = 1)
    @Column(name = "id")
    private long id;

    @NotNull
    @Column(name = "nome")
    private String nome;

    @NotNull
    @Column(name = "descricao")
    private String descricao;

    @NotNull
    @Column(name = "preco")
    private Float preco;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id", referencedColumnName = "id")
    private Categoria categoria;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nacionalidade_id", referencedColumnName = "id")
    private Nacionalidade nacionalidade;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "harmonizacao_id", referencedColumnName = "id")
    private Harmonizacao harmonizacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fornecedor_id", referencedColumnName = "id")
    private Fornecedor fornecedor;


    // GET & SET

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Harmonizacao getHarmonizacao() {
        return harmonizacao;
    }

    public void setHarmonizacao(Harmonizacao harmonizacao) {
        this.harmonizacao = harmonizacao;
    }

    public Nacionalidade getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(Nacionalidade nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getPreco() {
        return preco;
    }

    public void setPreco(Float preco) {
        this.preco = preco;
    }
}