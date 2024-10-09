package io.github.ramonrodsou.controller;

import io.github.ramonrodsou.dto.PessoaRequest;
import io.github.ramonrodsou.entity.*;
import io.github.ramonrodsou.repository.CargoRepository;
import io.github.ramonrodsou.repository.GrupoCrescimentoRepository;
import io.github.ramonrodsou.repository.PessoaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.Optional;
import java.util.UUID;

@Path("/pessoa")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@ApplicationScoped
public class PessoaController {

    private final PessoaRepository pessoaRepository;
    private final CargoRepository cargoRepository;
    private final GrupoCrescimentoRepository grupoCrescimentoRepository;

    @Inject
    public PessoaController(PessoaRepository pessoaRepository, CargoRepository cargoRepository, GrupoCrescimentoRepository grupoCrescimentoRepository) {
        this.pessoaRepository = pessoaRepository;
        this.cargoRepository = cargoRepository;
        this.grupoCrescimentoRepository = grupoCrescimentoRepository;
    }

    @POST
    @Transactional
    public Response novaPessoa(PessoaRequest pessoaRequest) {

        PessoaEntity pessoa = new PessoaEntity();
        pessoa.setNome(pessoaRequest.getNome());
        pessoa.setSobreNome(pessoaRequest.getSobreNome());
        pessoa.setEmail(pessoaRequest.getEmail());
        pessoa.setTelefone(pessoaRequest.getTelefone());
        pessoa.setCPF(pessoaRequest.getCPF());
        pessoa.setDataNascimento(pessoaRequest.getDataNascimento());
        pessoa.setDataCasamento(pessoaRequest.getDataCasamento());
        pessoa.setDataBatismo(pessoaRequest.getDataBatismo());
        pessoa.setNomePai(pessoaRequest.getNomePai());
        pessoa.setNomeMae(pessoaRequest.getNomeMae());

        try {
            EstadoCivilEntity estadoCivil = EstadoCivilEntity.valueOf(pessoaRequest.getEstadoCivil().toUpperCase());
            pessoa.setEstadoCivil(estadoCivil);

        }catch (IllegalArgumentException e ){
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Estado Civil inválida: " + pessoaRequest.getEstadoCivil())
                    .build();
        }

        try {
            FuncaoEntity funcao = FuncaoEntity.valueOf(pessoaRequest.getFuncao().toUpperCase());
            pessoa.setFuncao(funcao);

        }catch (IllegalArgumentException e ){
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Função inválida: " + pessoaRequest.getFuncao())
                    .build();
        }

        pessoaRepository.persist(pessoa);

        return Response.status(Response.Status.CREATED).entity(pessoa).build();
    }
}
