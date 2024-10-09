package io.github.ramonrodsou.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.util.UUID;

@Entity
@Table(name = "cargo")
public class CargoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "cargo_id")
    private UUID id;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;
    private Boolean PodeAddOferta;
    private Boolean PodeAddAdmUsers;
    private Boolean PodeViewRelatorio;
    private Boolean PodeAddPessoa;
}
