package com.exemplo.projetoapi;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/turmas")
public class ProjetoController {

    @GetMapping("/nome")
    public String consultarNomeTurma() {
        return "Turma de Desenvolvimento de APIs - T03N";
    }

    @GetMapping("/quantidade")
    public int consultarQuantidadeAlunos() {
        return 25;
    }

    @PostMapping
    public ResponseEntity<String> criarTurma() {
        String mensagem = "Turma T03N criada";
        return new ResponseEntity<>(mensagem, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> atualizarTurma(@PathVariable String id) {
        String mensagem = "Turma " + id + " atualizada";
        return ResponseEntity.ok(mensagem);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarTurma(@PathVariable String id) {
        System.out.println("Recurso da turma " + id + " foi deletado.");
    }

    @GetMapping("/disciplina")
    public String consultarDisciplina() {
        return "Desenvolvimento de Sistemas II";
    }

    @GetMapping("/alunos")
    public List<AlunoDTO> listarAlunos() {
        List<AlunoDTO> alunos = Arrays.asList(
            new AlunoDTO(1001L, "João da Silva"),
            new AlunoDTO(1002L, "Maria Oliveira"),
            new AlunoDTO(1003L, "Pedro Souza"),
            new AlunoDTO(1004L, "Ana Pereira")
        );
        return alunos;
    }
}