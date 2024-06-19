package model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.io.Serializable;

@Entity
@Table(name = "pet")
public class Pet implements Serializable {
    private static final long serialVersionUID = -7458494654224302623L;
    private Integer id;

    private Cliente cliente;

    private Integer idCliente;

    private Integer peso;

    private String sexo;

    private Integer idade;

    private String nome;

    private String corPredominante;

    private String obs;

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
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @NotNull
    @Column(name = "id_cliente", nullable = false)
    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    @NotNull
    @Column(name = "peso", nullable = false)
    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Size(max = 9)
    @NotNull
    @Column(name = "sexo", nullable = false, length = 9)
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @NotNull
    @Column(name = "idade", nullable = false)
    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Size(max = 20)
    @NotNull
    @Column(name = "nome", nullable = false, length = 20)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Size(max = 10)
    @NotNull
    @Column(name = "cor_predominante", nullable = false, length = 10)
    public String getCorPredominante() {
        return corPredominante;
    }

    public void setCorPredominante(String corPredominante) {
        this.corPredominante = corPredominante;
    }

    @Size(max = 70)
    @Column(name = "obs", length = 70)
    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

}