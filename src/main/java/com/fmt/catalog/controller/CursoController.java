package com.fmt.catalog.controller;

import com.fmt.catalog.model.Curso;
import com.fmt.catalog.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/curso")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public ArrayList<Curso> getTodosCursos() {
        return cursoService.consultarTodosCursos();
    }

    @PostMapping
    public void postCurso(@RequestBody Curso curso) {
        cursoService.cadastrarCurso(curso);
    }

}
