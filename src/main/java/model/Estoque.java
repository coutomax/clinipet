package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

@Entity
@Table(name = "estoque")
public class Estoque implements Serializable {
    private static final long serialVersionUID = -4223576112018036204L;
    private Integer id;

    private Produto idProduto;

    private Gerente idGerente;

    private Integer quantidade;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_produto", nullable = false)
    public Produto getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Produto idProduto) {
        this.idProduto = idProduto;
    }

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_gerente", nullable = false)
    public Gerente getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(Gerente idGerente) {
        this.idGerente = idGerente;
    }

    @NotNull
    @Column(name = "quantidade", nullable = false)
    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

}