package com.felipeemanuel.mineiracaodados.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.felipeemanuel.mineiracaodados.controller.dto.TurmaDto;
import com.felipeemanuel.mineiracaodados.model.TurmaEntity;
import com.felipeemanuel.mineiracaodados.repository.TurmaRepository;

@RestController
public class TurmaController {

    @Autowired
    private TurmaRepository turmaRepository;

    @PostMapping("/turma")
    public TurmaDto salvarTurma(@RequestBody TurmaDto turma) {
        final TurmaEntity turmaEntity = new TurmaEntity();
        turmaEntity.setCurso(turma.getCurso());
        turmaEntity.setNome(turma.getNome());

        TurmaEntity turmaPersistida = turmaRepository.save(turmaEntity);

        return turma;
    }

    @GetMapping("/turma/{nome}")
    public TurmaEntity buscarTurma(@PathVariable String nome) {
        TurmaEntity entity = turmaRepository.findByNome(nome);

        return entity;
    }

}
