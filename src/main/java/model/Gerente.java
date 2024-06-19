package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

import java.io.Serializable;

@Entity
@Table(name = "gerente")
public class Gerente implements Serializable {
    private static final long serialVersionUID = -9209176354120619786L;
    private Integer id;

    private Funcionario idFuncionario;

    private Boolean autorizacao = false;

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
    @JoinColumn(name = "id_funcionario", nullable = false)
    public Funcionario getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(Funcionario idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    @NotNull
    @Column(name = "autorizacao", nullable = false)
    public Boolean getAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(Boolean autorizacao) {
        this.autorizacao = autorizacao;
    }

}