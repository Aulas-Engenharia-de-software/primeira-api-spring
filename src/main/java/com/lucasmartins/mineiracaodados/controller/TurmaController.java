package com.lucasmartins.mineiracaodados.controller;

import com.lucasmartins.mineiracaodados.controller.dto.TurmaDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TurmaController {

    @GetMapping("/turma")
    public TurmaDto buscarTurma(@RequestBody TurmaDto turma) {
        return turma;
    }

}
