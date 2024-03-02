package com.fmt.catalog.model;

import lombok.Getter;

import java.time.LocalDate;
import java.util.ArrayList;

@Getter
public class Aluno {

    private static Integer proximoId = 1;

    @Getter
    private int id;

    @Getter
    private String nomeDoAluno;

    @Getter
    private final LocalDate dataDeNascimento;


    public static ArrayList<Aluno> alunosList = new ArrayList<>();


    public Aluno(String nomeDoAluno, LocalDate dataDeNascimento) {
        this.id = proximoId++;
        this.nomeDoAluno = nomeDoAluno;
        this.dataDeNascimento = dataDeNascimento;
    }

    public static void inserirAlunoEmAlunosList(Aluno aluno) {
        alunosList.add(aluno);
    }


}
