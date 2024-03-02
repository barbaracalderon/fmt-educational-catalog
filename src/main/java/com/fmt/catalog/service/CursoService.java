package com.fmt.catalog.service;

import com.fmt.catalog.model.Curso;

import java.util.ArrayList;

public class CursoService {

    private static ArrayList<Curso> cursosList = new ArrayList<>();


    public ArrayList<Curso> getTodosCursos() {
        return cursosList;
    }

    public void postCurso(Curso curso) {
        cursosList.add(curso);
    }

}
