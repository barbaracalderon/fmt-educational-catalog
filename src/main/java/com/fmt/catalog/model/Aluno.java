package com.fmt.catalog.model;

import lombok.Getter;

import java.time.LocalDate;

public class Aluno {
    private static Integer proximoId = 1;

    @Getter
    private int id;

    @Getter
    private String nomeDoAluno;

    private final LocalDate dataDeNascimento;

    public Aluno(String nomeDoAluno, LocalDate dataDeNascimento) {
        this.id = proximoId++;
        this.nomeDoAluno = nomeDoAluno;
        this.dataDeNascimento = dataDeNascimento;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }


}
