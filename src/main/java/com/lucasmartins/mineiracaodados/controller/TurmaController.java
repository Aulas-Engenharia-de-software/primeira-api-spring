package com.lucasmartins.mineiracaodados.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

  @GetMapping("/nome")
  @ResponseStatus(HttpStatus.OK)
  public String buscarNomeTurma() {
    return "T03N - Mineracao de Dados";
  }

  @GetMapping("/aluno")
  @ResponseStatus(HttpStatus.OK)
  public int buscarAlunos() {
    return 600;
  }

  // As atividades iniciam aqui
  
  @PostMapping("/criar")
  @ResponseStatus(HttpStatus.CREATED)
  public String criarTurma() {
      return "Turma T03N criada";
  }

  @PutMapping("/atualizar")
  @ResponseStatus(HttpStatus.OK)
  public String atualizarTurma() {
      return "Turma T03N atualizada";
  }

  @DeleteMapping("/deletar")
  @ResponseStatus(HttpStatus.NO_CONTENT)
  public void deletarTurma() {
      // não retornei nada por ser para excluir
  }

  @GetMapping("/disciplina")
  @ResponseStatus(HttpStatus.OK)
  public String consultarDisciplina() {
      return "Mineracao de Dados";
  }

  @GetMapping("/alunos")
  @ResponseStatus(HttpStatus.OK)
  public List<String> listarAlunos() {
      return Arrays.asList("Larissa","Gislaine","Maria");
  }
}