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

    @GetMapping("{idCurso}")
    public Curso getCurso(@PathVariable Integer idCurso) {
        return cursoService.encontrarCursoPorId(idCurso);
    }

    @PostMapping
    public void postCurso(@RequestBody Curso curso) {
        cursoService.cadastrarCurso(curso);
    }

    @PostMapping("{idCurso}/matricula")
    public void matricularAlunoEmCurso(@PathVariable Integer idCurso, @RequestBody Integer idAluno) {
        cursoService.matricularAlunoEmCurso(idCurso, idAluno);
    }

}
