package io.github.ramonrodsou.entity;
import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "pessoa")
public class PessoaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "pes_id", nullable = false)
    private UUID id;

    @Column(name = "pes_nome")
    private String nome;
    @Column(name = "pes_sobrenome")
    private String sobreNome;
    @Column(name = "pes_email")
    private String email;
    @Column(name = "pes_telefone")
    private int telefone;
    @Column(name = "pes_estado_civil")
    private EstadoCivilEntity estadoCivil;
    @Column(name = "CPF")
    private int CPF;
    @Column(name = "pes_data_nascimento")
    private Date dataNascimento;
    @Column(name = "pes_data_casamento")
    private Date dataCasamento;
    @Column(name = "pes_data_batismo")
    private Date dataBatismo;
    @Column(name = "pes_nome_pai")
    private String nomePai;
    @Column(name = "pes_nome_mae")
    private String NomeMae;
    @Column(name = "carg_chave_fk")
    @Enumerated(EnumType.STRING)
    private CargoEntity cargo;
    @Column(name = "gc_chave_fk")
    private GrupoCrescimentoEntity grupoCrescimento;
    @Column(name = "funcao_chave_fk")
    @Enumerated(EnumType.STRING)
    private FuncaoEntity funcao;

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

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public EstadoCivilEntity getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivilEntity estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataCasamento() {
        return dataCasamento;
    }

    public void setDataCasamento(Date dataCasamento) {
        this.dataCasamento = dataCasamento;
    }

    public Date getDataBatismo() {
        return dataBatismo;
    }

    public void setDataBatismo(Date dataBatismo) {
        this.dataBatismo = dataBatismo;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getNomeMae() {
        return NomeMae;
    }

    public void setNomeMae(String nomeMae) {
        NomeMae = nomeMae;
    }

    public CargoEntity getCargo() {
        return cargo;
    }

    public void setCargo(CargoEntity cargo) {
        this.cargo = cargo;
    }

    public GrupoCrescimentoEntity getGrupoCrescimento() {
        return grupoCrescimento;
    }

    public void setGrupoCrescimento(GrupoCrescimentoEntity grupoCrescimento) {
        this.grupoCrescimento = grupoCrescimento;
    }

    public FuncaoEntity getFuncao() {
        return funcao;
    }

    public void setFuncao(FuncaoEntity funcao) {
        this.funcao = funcao;
    }
}
