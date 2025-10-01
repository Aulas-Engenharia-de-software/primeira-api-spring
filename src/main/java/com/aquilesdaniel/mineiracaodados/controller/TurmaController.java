package com.aquilesdaniel.mineiracaodados.controller;

import com.aquilesdaniel.mineiracaodados.controller.dto.TurmaDto;
import com.aquilesdaniel.mineiracaodados.model.TurmaEntity;
import com.aquilesdaniel.mineiracaodados.repository.TurmaRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/turma/{id}")
    public TurmaEntity buscarTurma(@PathVariable Integer id) {
        Optional<TurmaEntity> entity = turmaRepository.findById(id);

        return entity.get();
    }

}