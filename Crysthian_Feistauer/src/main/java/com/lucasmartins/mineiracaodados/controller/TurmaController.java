package com.lucasmartins.mineiracaodados.controller;

import com.lucasmartins.mineiracaodados.model.Turma;
import com.lucasmartins.mineiracaodados.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    @Autowired
    private TurmaRepository turmaRepository;

    @GetMapping
    public List<Turma> listarTurmas() {
        return turmaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Turma buscarTurmaPorId(@PathVariable Long id) {
        return turmaRepository.findById(id).orElse(null);
    }

    @GetMapping("/nome")
    public String consultarNomeTurma() {
        return "T03N";
    }

    @GetMapping("/quantidade")
    public int consultarQuantidadeAlunos() {
        return 30;
    }

    @GetMapping("/alunos")
    public List<String> consultarListaAlunos() {
        return Arrays.asList("crysthian", "maria", "thiago", "gislaine");
    }

    @PostMapping("/criar")
    public String criarTurma() {
        return "Turma T03N criada";
    }

    @PostMapping
    public Turma criarTurmaCompleta(@RequestBody Turma turma) {
        return turmaRepository.save(turma);
    }

    @PutMapping("/atualizar")
    public String atualizarTurma() {
        return "Turma T03N atualizada";
    }

    @PutMapping("/{id}")
    public Turma atualizarTurmaCompleta(@PathVariable Long id, @RequestBody Turma turma) {
        turma.setId(id);
        return turmaRepository.save(turma);
    }

    @DeleteMapping("/deletar")
    public void deletarTurma() {
    }

    @DeleteMapping("/{id}")
    public void deletarTurmaCompleta(@PathVariable Long id) {
        turmaRepository.deleteById(id);
    }

    @GetMapping("/disciplina")
    public String consultarDisciplinaTurma() {
        return "Engenharia de Software";
    }

}
