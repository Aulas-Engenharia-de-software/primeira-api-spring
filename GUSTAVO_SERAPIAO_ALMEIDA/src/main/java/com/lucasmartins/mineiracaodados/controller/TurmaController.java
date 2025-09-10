package com.lucasmartins.mineiracaodados.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    // GET /turmas/nome
    @GetMapping("/nome")
    @ResponseStatus(HttpStatus.OK)
    public String buscarNomeTurma() {
        return "T03N - Mineração de Dados";
    }

    // GET /turmas/quantidade
    @GetMapping("/quantidade")
    @ResponseStatus(HttpStatus.OK)
    public Integer quantidadeAlunosTurma() {
        return 999;
    }

    // POST /turmas  -> criação
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String criarTurma() {
        return "Turma T03N criada";
    }

    // PUT /turmas/{codigo}  -> atualização
    @PutMapping("/{codigo}")
    @ResponseStatus(HttpStatus.OK)
    public String atualizarTurma(@PathVariable String codigo) {
        return "Turma " + codigo + " atualizada";
    }

    // DELETE /turmas/{codigo}  -> deleção (sem corpo)
    @DeleteMapping("/{codigo}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarTurma(@PathVariable String codigo) {
        // sem retorno (204)
    }

    // GET /turmas/disciplina  -> consulta da disciplina
    @GetMapping("/disciplina")
    @ResponseStatus(HttpStatus.OK)
    public String consultarDisciplina() {
        return "Mineração de Dados";
    }

    // GET /turmas/alunos  -> lista fixa mockada
    @GetMapping("/alunos")
    @ResponseStatus(HttpStatus.OK)
    public List<String> listarAlunos() {
        return Arrays.asList("Ana", "Bruno", "Carla", "Diego", "Eduarda");
    }
}
