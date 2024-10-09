package io.github.ramonrodsou.dto;

import io.github.ramonrodsou.entity.CargoEntity;
import io.github.ramonrodsou.entity.EstadoCivilEntity;
import io.github.ramonrodsou.entity.FuncaoEntity;
import io.github.ramonrodsou.entity.GrupoCrescimentoEntity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public class PessoaRequest {

    @NotBlank(message = "Nome é obrigatório")
    private String nome;
    @NotBlank(message = "Sobrenome é obrigatório")
    private String sobreNome;
    @NotBlank(message = "Email é obrigatório")
    private String email;
    @NotNull(message = "Telefone é obrigatório")
    private int telefone;
    @NotBlank(message = "Estado civíl é obrigatório")
    private String estadoCivil;
    @NotNull(message = "CPF é obrigatório")
    private int CPF;
    @NotBlank(message = "Data de Nascimento é obrigatório")
    private Date dataNascimento;
    @NotBlank(message = "Data de Casamento é obrigatório")
    private Date dataCasamento;
    @NotBlank(message = "Data de Batismo é obrigatório")
    private Date dataBatismo;
    @NotBlank(message = "Nome do pai é obrigatório")
    private String nomePai;
    @NotBlank(message = "Nome da mãe é obrigatório")
    private String NomeMae;
    @NotBlank(message = "Cargo é obrigatório")
    private CargoEntity cargo;
    private GrupoCrescimentoEntity grupoCrescimento;
    @NotBlank(message = "Função é obrigatório")
    private String funcao;

    public @NotBlank(message = "Nome é obrigatório") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "Nome é obrigatório") String nome) {
        this.nome = nome;
    }

    public @NotBlank(message = "Sobrenome é obrigatório") String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(@NotBlank(message = "Sobrenome é obrigatório") String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public @NotBlank(message = "Email é obrigatório") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email é obrigatório") String email) {
        this.email = email;
    }

    @NotNull(message = "Telefone é obrigatório")
    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(@NotNull(message = "Telefone é obrigatório") int telefone) {
        this.telefone = telefone;
    }

    public @NotBlank(message = "Estado civíl é obrigatório") String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(@NotBlank(message = "Estado civíl é obrigatório") String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    @NotNull(message = "CPF é obrigatório")
    public int getCPF() {
        return CPF;
    }

    public void setCPF(@NotNull(message = "CPF é obrigatório") int CPF) {
        this.CPF = CPF;
    }

    public @NotBlank(message = "Data de Nascimento é obrigatório") Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(@NotBlank(message = "Data de Nascimento é obrigatório") Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public @NotBlank(message = "Data de Casamento é obrigatório") Date getDataCasamento() {
        return dataCasamento;
    }

    public void setDataCasamento(@NotBlank(message = "Data de Casamento é obrigatório") Date dataCasamento) {
        this.dataCasamento = dataCasamento;
    }

    public @NotBlank(message = "Data de Batismo é obrigatório") Date getDataBatismo() {
        return dataBatismo;
    }

    public void setDataBatismo(@NotBlank(message = "Data de Batismo é obrigatório") Date dataBatismo) {
        this.dataBatismo = dataBatismo;
    }

    public @NotBlank(message = "Nome do pai é obrigatório") String getNomePai() {
        return nomePai;
    }

    public void setNomePai(@NotBlank(message = "Nome do pai é obrigatório") String nomePai) {
        this.nomePai = nomePai;
    }

    public @NotBlank(message = "Nome da mãe é obrigatório") String getNomeMae() {
        return NomeMae;
    }

    public void setNomeMae(@NotBlank(message = "Nome da mãe é obrigatório") String nomeMae) {
        NomeMae = nomeMae;
    }

    public @NotBlank(message = "Cargo é obrigatório") CargoEntity getCargo() {
        return cargo;
    }

    public void setCargo(@NotBlank(message = "Cargo é obrigatório") CargoEntity cargo) {
        this.cargo = cargo;
    }

    public GrupoCrescimentoEntity getGrupoCrescimento() {
        return grupoCrescimento;
    }

    public void setGrupoCrescimento(GrupoCrescimentoEntity grupoCrescimento) {
        this.grupoCrescimento = grupoCrescimento;
    }

    public @NotBlank(message = "Função é obrigatório") String getFuncao() {
        return funcao;
    }

    public void setFuncao(@NotBlank(message = "Função é obrigatório") String funcao) {
        this.funcao = funcao;
    }
}
