package com.fmt.catalog.controller;

import com.fmt.catalog.model.Aluno;
import com.fmt.catalog.service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public ArrayList<Aluno> getTodosAlunos() {
        return alunoService.consultarTodosAlunos();
    }

    @GetMapping("/{idAluno}")
    public Aluno getAluno(@PathVariable Integer idAluno) {
        return alunoService.encontrarAlunoPorId(idAluno);
    }

    @PostMapping
    public void postAluno(@RequestBody Aluno aluno) {
        alunoService.cadastrarAluno(aluno);
    }

}
