package com.lucasmartins.mineiracaodados.controller;

import com.lucasmartins.mineiracaodados.model.Disciplina;
import com.lucasmartins.mineiracaodados.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {
    
    @Autowired
    private DisciplinaRepository disciplinaRepository;
    
    @GetMapping
    public List<Disciplina> listarDisciplinas() {
        return disciplinaRepository.findAll();
    }
    
    @GetMapping("/{id}")
    public Disciplina buscarDisciplinaPorId(@PathVariable Long id) {
        return disciplinaRepository.findById(id).orElse(null);
    }
    
    @GetMapping("/turma/{turmaId}")
    public List<Disciplina> listarDisciplinasPorTurma(@PathVariable Long turmaId) {
        return disciplinaRepository.findByTurmaId(turmaId);
    }
    
    @PostMapping
    public Disciplina criarDisciplina(@RequestBody Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }
    
    @PutMapping("/{id}")
    public Disciplina atualizarDisciplina(@PathVariable Long id, @RequestBody Disciplina disciplina) {
        disciplina.setId(id);
        return disciplinaRepository.save(disciplina);
    }
    
    @DeleteMapping("/{id}")
    public void deletarDisciplina(@PathVariable Long id) {
        disciplinaRepository.deleteById(id);
    }
}