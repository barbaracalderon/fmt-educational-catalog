package com.fmt.catalog.service;

import com.fmt.catalog.model.Aluno;

import java.util.ArrayList;

public class AlunoService {

    private static ArrayList<Aluno> alunosList = new ArrayList<>();

    public ArrayList<Aluno> getTodosAlunos() {
        return alunosList;
    }

    public void postAluno(Aluno aluno) {
        alunosList.add(aluno);
    }
}
