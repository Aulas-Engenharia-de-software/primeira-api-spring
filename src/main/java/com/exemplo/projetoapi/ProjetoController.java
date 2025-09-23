package com.exemplo.projetoapi;

import com.exemplo.projetoapi.model.Turma;
import com.exemplo.projetoapi.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turmas")
public class ProjetoController {

    @Autowired // Injeta o repositório para podermos usá-lo
    private TurmaRepository turmaRepository;

    // Endpoint para CRIAR uma nova turma (e sua disciplina junto)
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Turma criarTurma(@RequestBody Turma turma) {
        // O método save já cria a turma e a disciplina por causa do "CascadeType.ALL"
        return turmaRepository.save(turma);
    }

    // Endpoint para LISTAR todas as turmas
    @GetMapping
    public List<Turma> listarTurmas() {
        return turmaRepository.findAll();
    }

    // Endpoint para BUSCAR uma turma específica pelo ID
    @GetMapping("/{id}")
    public ResponseEntity<Turma> buscarTurmaPorId(@PathVariable Long id) {
        return turmaRepository.findById(id)
                .map(turma -> ResponseEntity.ok(turma))
                .orElse(ResponseEntity.notFound().build());
    }

    // Endpoint para DELETAR uma turma
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarTurma(@PathVariable Long id) {
        if (!turmaRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        turmaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}