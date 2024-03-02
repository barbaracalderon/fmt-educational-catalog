package com.fmt.catalog.controller;

import com.fmt.catalog.model.Aluno;
import com.fmt.catalog.service.AlunoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
        return alunoService.getTodosAlunos();
    }

}
