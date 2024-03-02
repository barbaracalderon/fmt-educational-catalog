package com.fmt.catalog.service;

import com.fmt.catalog.model.Curso;

import java.util.ArrayList;

public class CursoService {

    public ArrayList<Curso> consultarTodosCursos() {
        return Curso.cursosList;
    }

    public void cadastrarCurso(Curso curso) {
        Curso.inserirCursoEmCursosList(curso);
    }

}
