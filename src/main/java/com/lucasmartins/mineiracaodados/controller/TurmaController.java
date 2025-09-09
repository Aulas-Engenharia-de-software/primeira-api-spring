package com.lucasmartins.mineiracaodados.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TurmaController {

        @PostMapping(value = "/api/nome", produces = "application/json")
        public ResponseEntity<String> buscarAlunos() {
            return ResponseEntity.status(HttpStatus.OK).body("Nome da turma: T03N");
        }

        @PostMapping(value = "/api/criacao-turma", produces = "application/json")
        public ResponseEntity<String> criacaoTurma() {
            return ResponseEntity.status(HttpStatus.OK).body("Turma T03N criada");
        }
        @PostMapping(value = "/api/atualizacao-turma", produces = "application/json")
        public ResponseEntity<String> atualTurma() {
            return ResponseEntity.status(HttpStatus.OK).body("Turma T03N atualizada");
        }
        @PostMapping(value = "/api/deletar-turma", produces = "application/json")
        public ResponseEntity<String> deleteTurma() {
            return ResponseEntity.status(HttpStatus.OK).body("");
        }
        @PostMapping(value = "/api/disciplina-turma", produces = "application/json")
        public ResponseEntity<String> disciplinaTurma() {
            return ResponseEntity.status(HttpStatus.OK).body("Mineiração de Dados");
        }
        @PostMapping(value = "/api/lista-alunos", produces = "application/json")
        public ResponseEntity<String> listarAlunos() {
            List<String> alunos = new ArrayList<>();
            alunos.add("Gustavo");
            alunos.add("Igor");
            alunos.add("João");

        return ResponseEntity.ok("Lista de alunos: "+ alunos);
    }

}
