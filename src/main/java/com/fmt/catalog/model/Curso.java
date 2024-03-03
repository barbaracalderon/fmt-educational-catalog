package com.fmt.catalog.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Data
public class Curso {

    public static int proximoId = 1;

    @Getter
    private int id;

    @Getter
    private String nomeDoCurso;

    @Getter
    private String descricao;

    @Getter
    private int cargaHoraria;

    public static ArrayList<Curso> cursosList = new ArrayList<>();

    @Setter
    @Getter
    private ArrayList<Aluno> alunosMatriculadosList;

    public Curso(String nomeDoCurso, String descricao, int cargaHoraria) {
        this.id = proximoId++;
        this.nomeDoCurso = nomeDoCurso;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
    }

    public static void inserirCursoEmCursosList(Curso curso) {
        cursosList.add(curso);
    }

    public void setAlunosMatriculados(ArrayList<Aluno> alunosMatriculados) {
        alunosMatriculadosList = alunosMatriculados;
    }

    public static Curso getCursoDaListaPorId(Integer id) {
        for (Curso curso: cursosList) {
            if (curso.getId() == id) {
                return curso;
            }
        }
        return null;
    }
}
