package com.seuprojeto.controller;

import com.seuprojeto.model.Disciplina;
import com.seuprojeto.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @GetMapping
    public List<Disciplina> listar() {
        return disciplinaRepository.findAll();
    }

    @PostMapping
    public Disciplina criar(@RequestBody Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }
}

