package com.lucasmartins.mineiracaodados.controller;

import com.lucasmartins.mineiracaodados.model.Disciplina;
import com.lucasmartins.mineiracaodados.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/disciplinas")
public class DisciplinaController {
    
    @Autowired
    private DisciplinaRepository disciplinaRepository;
    
    // GET - Buscar todas as disciplinas
    @GetMapping
    public List<Disciplina> getAllDisciplinas() {
        return disciplinaRepository.findAll();
    }
    
    // GET - Buscar disciplina por ID
    @GetMapping("/{id}")
    public ResponseEntity<Disciplina> getDisciplinaById(@PathVariable Long id) {
        Optional<Disciplina> disciplina = disciplinaRepository.findById(id);
        
        if (disciplina.isPresent()) {
            return ResponseEntity.ok(disciplina.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    // POST - Criar nova disciplina
    @PostMapping
    public ResponseEntity<Disciplina> createDisciplina(@Valid @RequestBody Disciplina disciplina) {
        try {
            Disciplina novaDisciplina = disciplinaRepository.save(disciplina);
            return ResponseEntity.status(HttpStatus.CREATED).body(novaDisciplina);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }
    
    // PUT - Atualizar disciplina existente
    @PutMapping("/{id}")
    public ResponseEntity<Disciplina> updateDisciplina(@PathVariable Long id, @Valid @RequestBody Disciplina disciplinaDetails) {
        Optional<Disciplina> optionalDisciplina = disciplinaRepository.findById(id);
        
        if (optionalDisciplina.isPresent()) {
            Disciplina disciplina = optionalDisciplina.get();
            disciplina.setDescricao(disciplinaDetails.getDescricao());
            disciplina.setHoras_aula(disciplinaDetails.getHoras_aula());
            disciplina.setCurso(disciplinaDetails.getCurso());
            disciplina.setProfessor(disciplinaDetails.getProfessor());
            
            Disciplina updatedDisciplina = disciplinaRepository.save(disciplina);
            return ResponseEntity.ok(updatedDisciplina);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    
    // DELETE - Deletar disciplina
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDisciplina(@PathVariable Long id) {
        if (disciplinaRepository.existsById(id)) {
            disciplinaRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}