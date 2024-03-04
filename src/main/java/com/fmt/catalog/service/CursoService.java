package com.fmt.catalog.service;

import com.fmt.catalog.model.Aluno;
import com.fmt.catalog.model.Curso;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CursoService {

    private final AlunoService alunoService;

    public CursoService(AlunoService alunoService) {
        this.alunoService = alunoService;
    }


    public ArrayList<Curso> consultarTodosCursos() {
        return Curso.cursosList;
    }

    public void cadastrarCurso(Curso curso) {
        Curso.inserirCursoEmCursosList(curso);
    }

    public Curso encontrarCursoPorId(Integer id) {
        return Curso.getCursoDaListaPorId(id);
    }


    public void matricularAlunoEmCurso(Integer idCurso, Integer idAluno) {
        Curso curso = encontrarCursoPorId(idCurso);
        Aluno aluno = alunoService.encontrarAlunoPorId(idAluno);

        if (curso != null && aluno != null) {
            ArrayList<Aluno> alunosMatriculados = curso.getAlunosMatriculadosList();
            alunosMatriculados.add(aluno);
            curso.setAlunosMatriculadosList(alunosMatriculados);
        } else {
            throw new IllegalArgumentException("Curso ou aluno não encontrado.");
        }
    }

}
