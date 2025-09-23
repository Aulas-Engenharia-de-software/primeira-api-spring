package com.bruno_goedert.org.projeto.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/aluno")
public class AlunoController {

    @GetMapping("/quantidade")
    @ResponseStatus(HttpStatus.OK)
    public String buscarIdade() {
        return "10";
    }

    @PostMapping("/post")
    @ResponseStatus(HttpStatus.CREATED)
    public String post() {
        return "CRIOU TUMAR 03";
    }


    @DeleteMapping("/delete")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String delete() {
        return "DELETE TUMAR 03";
    }
}
