package io.github.ramonrodsou.entity;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "pessoa")
public class PessoaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pes_id", nullable = false)

    private Integer id;
    private String nome;
    private String sobreNome;
    private String email;
    private int telefone;
    private EstadoCivilEntity estadoCivil;
    private int CPF;
    private Date dataNascimento;
    private Date dataCasamento;
    private Date dataBatismo;
    private String nomePai;
    private String NomeMae;

}
