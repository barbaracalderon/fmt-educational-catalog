package com.fmt.catalog.service;

import com.fmt.catalog.model.Aluno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AlunoService {

    public ArrayList<Aluno> consultarTodosAlunos() {
        return Aluno.alunosList;
    }

    public void cadastrarAluno(Aluno aluno) {
        Aluno.inserirAlunoEmAlunosList(aluno);
    }

    public Aluno encontrarAlunoPorId(Integer id) {
        return Aluno.getAlunoDaListaPorId(id);
    }

}
