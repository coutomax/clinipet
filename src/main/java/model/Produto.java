package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "produto")
public class Produto implements Serializable {
    private static final long serialVersionUID = 6357349794889956399L;
    private Integer id;

    private Gerente gerente;

    private Integer idGerente;

    private BigDecimal valor;

    private String descricao;

    private BigDecimal custoProduto;

    private Instant dataValidade;

    @Id
    @Column(name = "id", nullable = false)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    @NotNull
    @Column(name = "id_gerente", nullable = false)
    public Integer getIdGerente() {
        return idGerente;
    }

    public void setIdGerente(Integer idGerente) {
        this.idGerente = idGerente;
    }

    @NotNull
    @Column(name = "valor", nullable = false, precision = 10, scale = 2)
    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    @Size(max = 30)
    @NotNull
    @Column(name = "descricao", nullable = false, length = 30)
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @NotNull
    @Column(name = "custo_produto", nullable = false, precision = 10, scale = 2)
    public BigDecimal getCustoProduto() {
        return custoProduto;
    }

    public void setCustoProduto(BigDecimal custoProduto) {
        this.custoProduto = custoProduto;
    }

    @NotNull
    @Column(name = "data_validade", nullable = false)
    public Instant getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Instant dataValidade) {
        this.dataValidade = dataValidade;
    }

}