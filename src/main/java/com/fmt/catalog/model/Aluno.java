package com.fmt.catalog.model;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Aluno {
    private static Integer proximoId = 1;

    private int id;

    private String nomeDoAluno;

    private final LocalDate dataDeNascimento;

    public Aluno(String nomeDoAluno, LocalDate dataDeNascimento) {
        this.id = proximoId++;
        this.nomeDoAluno = nomeDoAluno;
        this.dataDeNascimento = dataDeNascimento;
    }


}
