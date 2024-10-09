package io.github.ramonrodsou.repository;

import io.github.ramonrodsou.entity.PessoaEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PessoaRepository implements PanacheRepository<PessoaEntity> {
}
