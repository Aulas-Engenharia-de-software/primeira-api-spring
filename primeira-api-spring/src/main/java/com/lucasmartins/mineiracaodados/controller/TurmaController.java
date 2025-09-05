package com.lucasmartins.mineiracaodados.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TurmaController {

    @GetMapping("/turma")
    public String buscarTurma() {
        return "T04N - Mineração de dados";
    }

}
