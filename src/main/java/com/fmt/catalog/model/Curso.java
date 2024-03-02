package com.fmt.catalog.model;

import lombok.Getter;

import java.util.ArrayList;

public class Curso {

    private static Integer proximoId = 1;

    @Getter
    private int id;

    @Getter
    private String nomeDoCurso;

    @Getter
    private String descricao;

    @Getter
    private int cargaHoraria;

    public static ArrayList<Curso> cursosList = new ArrayList<>();

    public Curso(String nomeDoCurso, String descricao, int cargaHoraria) {
        this.id = proximoId++;
        this.nomeDoCurso = nomeDoCurso;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public static void inserirCursoEmCursosList(Curso curso) {
        cursosList.add(curso);
    }

}
