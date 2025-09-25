package com.enzo.atividade.dois.controller;

import com.enzo.atividade.dois.model.DisciplinaEntity;
import com.enzo.atividade.dois.repositories.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    // Listar todas as disciplinas
    @GetMapping
    public List<DisciplinaEntity> getAll() {
        return disciplinaRepository.findAll();
    }

    // Buscar disciplina por ID
    @GetMapping("/{id}")
    public Optional<DisciplinaEntity> getById(@PathVariable Long id) {
        return disciplinaRepository.findById(id);
    }

    // Criar nova disciplina
    @PostMapping
    public DisciplinaEntity create(@RequestBody DisciplinaEntity disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    // Atualizar disciplina existente
    @PutMapping("/{id}")
    public DisciplinaEntity update(@PathVariable Long id, @RequestBody DisciplinaEntity disciplinaAtualizada) {
        return disciplinaRepository.findById(id).map(disciplina -> {
            disciplina.setDescricao(disciplinaAtualizada.getDescricao());
            disciplina.setHorasAula(disciplinaAtualizada.getHorasAula());
            disciplina.setCurso(disciplinaAtualizada.getCurso());
            disciplina.setProfessor(disciplinaAtualizada.getProfessor());
            disciplina.setTurma(disciplinaAtualizada.getTurma());
            return disciplinaRepository.save(disciplina);
        }).orElseThrow(() -> new RuntimeException("Disciplina não encontrada com id " + id));
    }

    // Deletar disciplina por ID
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        disciplinaRepository.deleteById(id);
    }
}
