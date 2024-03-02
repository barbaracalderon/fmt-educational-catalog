package com.fmt.catalog.service;

import com.fmt.catalog.model.Aluno;

import java.util.ArrayList;

public class AlunoService {

    public ArrayList<Aluno> consultarTodosAlunos() {
        return Aluno.alunosList;
    }

    public void cadastrarAluno(Aluno aluno) {
        Aluno.inserirAlunoEmAlunosList(aluno);
    }
}
