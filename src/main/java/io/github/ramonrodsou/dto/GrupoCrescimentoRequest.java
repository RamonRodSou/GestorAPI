package io.github.ramonrodsou.dto;

import io.github.ramonrodsou.entity.CargoEntity;
import jakarta.validation.constraints.NotBlank;

public class GrupoCrescimentoRequest {

    @NotBlank(message = "Nome é obrigatório")
    private String nome;
    @NotBlank(message = "Local é obrigatório")
    private String local;
    @NotBlank(message = "Cargo é obrigatório")
    private CargoEntity cargo;

    public @NotBlank(message = "Nome é obrigatório") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Local é obrigatório") String getLocal() {
        return local;
    }

    public void setLocal(@NotBlank(message = "Local é obrigatório") String local) {
        this.local = local;
    }

    public @NotBlank(message = "Cargo é obrigatório") CargoEntity getCargo() {
        return cargo;
    }

    public void setCargo(@NotBlank(message = "Cargo é obrigatório") CargoEntity cargo) {
        this.cargo = cargo;
    }
}
