package io.github.ramonrodsou.entity;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "grupo_crescimento")
public class GrupoCrescimentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "cg_id", nullable = false)
    private UUID id;
    @Column(name = "gc_nome")
    private String nome;
    @Column(name = "gc_local")
    private String local;
    @Column(name = "cargo_chave_fk")
    private CargoEntity cargo;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public CargoEntity getCargo() {
        return cargo;
    }

    public void setCargo(CargoEntity cargo) {
        this.cargo = cargo;
    }
}
