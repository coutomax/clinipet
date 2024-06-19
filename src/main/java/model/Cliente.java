package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {
    private static final long serialVersionUID = -3390893874354598022L;
    private Integer id;

    private Pessoa pessoa;

    private Integer idPessoa;

    private Boolean recebeMsg = false;

    private String cupomDesconto;

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
    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @NotNull
    @Column(name = "id_pessoa", nullable = false)
    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    @NotNull
    @Column(name = "recebe_msg", nullable = false)
    public Boolean getRecebeMsg() {
        return recebeMsg;
    }

    public void setRecebeMsg(Boolean recebeMsg) {
        this.recebeMsg = recebeMsg;
    }

    @Size(max = 7)
    @Column(name = "cupom_desconto", length = 7)
    public String getCupomDesconto() {
        return cupomDesconto;
    }

    public void setCupomDesconto(String cupomDesconto) {
        this.cupomDesconto = cupomDesconto;
    }

}