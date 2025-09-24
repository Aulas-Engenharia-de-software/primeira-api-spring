package com.lucasmartins.mineiracaodados.controller;

import com.lucasmartins.mineiracaodados.model.Disciplina;
import com.lucasmartins.mineiracaodados.model.TurmaEntity;
import com.lucasmartins.mineiracaodados.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    @Autowired
    private TurmaRepository turmaRepository;

    @PostMapping
    public TurmaEntity criarTurma(@RequestBody TurmaEntity turma) {
        return turmaRepository.save(turma);
    }

    @PostMapping("/{id}/disciplina")
    public TurmaEntity adicionarDisciplina(@PathVariable int id, @RequestBody Disciplina disciplina) {
        TurmaEntity turma = turmaRepository.findById(id).orElse(null);
        if (turma != null) {
            turma.setDisciplina(disciplina);
            return turmaRepository.save(turma);
        }
        return null;
    }
}