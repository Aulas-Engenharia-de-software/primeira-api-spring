package com.bruno_goedert.org.projeto.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    @GetMapping("/name")
    @ResponseStatus(HttpStatus.OK)
    public String getName() {
        return "Turma 03";
    }

    @GetMapping("/quantity")
    @ResponseStatus(HttpStatus.OK)
    public String getQuantity() {
        return "10";
    }

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public String create() {
        return "Turma T03N criada";
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public String update() {
        return "Turma T03N atualizada";
    }


    @DeleteMapping("/delete")
    @ResponseStatus(HttpStatus.OK)
    public String delete() {
        return "DELETE TUMAR 03";
    }

    @GetMapping("/disciplina")
    @ResponseStatus(HttpStatus.OK)
    public String getDisciplina() {
        return "Mineiração de dados";
    }

    @GetMapping("/alunos")
    @ResponseStatus(HttpStatus.OK)
    public List<String> getAlunos() {
        return Arrays.asList(
                "Ana Silva",
                "Carlos Souza",
                "Mariana Oliveira",
                "Pedro Santos",
                "Beatriz Costa"
        );
    }
}
