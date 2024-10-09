package io.github.ramonrodsou.entity;

import jakarta.persistence.Entity;

@Entity(name = "funcao")
public enum FuncaoEntity {
    PASTOR,
    LIDER,
    COLABORADOR,
    MEMBRO,
    VISITANTE
}
