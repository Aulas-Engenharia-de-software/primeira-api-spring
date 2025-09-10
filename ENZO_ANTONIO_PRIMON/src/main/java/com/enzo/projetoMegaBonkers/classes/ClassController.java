package com.enzo.projetoMegaBonkers.classes;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/turmas")
public class ClassController {

    @GetMapping
    public String searchClass() {
        return "T03N Mineração de dados";
    }

    @PostMapping("/criar")
    public String createClass() {
        return "Turma T03N criada";
    }

    @PutMapping("/atualizar")
    public String updateClass() {
        return "Turma T03N atualizada";
    }

    @DeleteMapping("/deletar")
    public String deleteClass() {
        return null;
    }

    @GetMapping("/disciplina")
    public String searchSubject() {
        return "T03N Projeto Mineiração de dados";
    }

    @GetMapping("/alunos")
    public String studentList() {
        String[] students;
        students = new String[]{"enzoca, aquiles, dalmolin, felipe, maylo"};

        final String string = Arrays.toString(students);

        return string;
    }
}