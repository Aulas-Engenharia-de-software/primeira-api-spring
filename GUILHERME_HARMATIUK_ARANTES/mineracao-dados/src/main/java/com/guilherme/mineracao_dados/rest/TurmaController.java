package com.guilherme.mineracao_dados.rest;

import com.guilherme.mineracao_dados.models.AlunoDto;
import com.guilherme.mineracao_dados.models.CreateTurmaDto;
import com.guilherme.mineracao_dados.models.TurmaDto;
import com.guilherme.mineracao_dados.response.DisciplinaTurmaResponseDto;
import com.guilherme.mineracao_dados.response.QtdAlunosResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/turma")
public class TurmaController {
    ArrayList<TurmaDto> listaTurmas = new ArrayList<>();
    Long idCounter = 0L;

    @PostMapping("create-turma")
    @ResponseStatus(HttpStatus.OK)
    public Long createTurma(
            @RequestBody CreateTurmaDto params
    ) {
        idCounter++;
        listaTurmas.add(params.toTurmaDto(idCounter));
        return idCounter;
    }

    @GetMapping("find-all-turmas")
    @ResponseStatus(HttpStatus.OK)
    public List<TurmaDto> findAllTurmas(
            @RequestParam("filtro") String param
    ) {
        return listaTurmas.stream().filter(v ->
                v.getName().toLowerCase().contains(
                        param.toLowerCase()
                )
        ).toList();
    }
    @GetMapping(value = "find-qtd-by-id", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public QtdAlunosResponseDto findQtdAlunosById(
            @RequestParam("id") Long param
    ) {
        TurmaDto turma = listaTurmas
                .stream()
                .filter(v -> Objects.equals(v.getId(), param))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Turma não encontrada."));
        return new QtdAlunosResponseDto(turma.getId(), turma.getAlunos().size());
    }
    @GetMapping("find-alunos-by-id")
    @ResponseStatus(HttpStatus.OK)
    public List<AlunoDto> findAlunosById(
            @RequestParam("id") Long param
    ) {
        TurmaDto turma = listaTurmas
                .stream()
                .filter(v -> Objects.equals(v.getId(), param))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Turma não encontrada."));
        return turma.getAlunos();
    }
    @PutMapping("insert-aluno-in-turma-by-id")
    @ResponseStatus(HttpStatus.OK)
    public void insertAlunoInTurmaById(
            @RequestParam("id") Long id,
            @RequestParam("nome-aluno") String nomeAluno
    ) {
        listaTurmas
                .stream()
                .filter(v -> Objects.equals(v.getId(), id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Turma não encontrada."))
                .addAluno(nomeAluno);
    }
    @GetMapping("find-disciplina-by-id")
    @ResponseStatus(HttpStatus.OK)
    public DisciplinaTurmaResponseDto findDisciplinaById(
            @RequestParam("id") Long param
    ) {
        TurmaDto turma = listaTurmas
                .stream()
                .filter(v -> Objects.equals(v.getId(), param))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Turma não encontrada."));
        return new DisciplinaTurmaResponseDto(
                turma.getId(),
                turma.getDisciplina()
        );
    }
    @PutMapping("set-turma-name-by-id")
    @ResponseStatus(HttpStatus.OK)
    public String setTurmaNameById(
            @RequestParam("id") Long id,
            @RequestParam("name") String newName
    ) {
        TurmaDto turma = listaTurmas
                .stream()
                .filter(v -> Objects.equals(v.getId(), id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Turma não encontrada."));
        turma.setName(newName);
        return "Turma " + turma.getName() + " atualizada.";
    }
    @DeleteMapping("delete-turma-by-id")
    @ResponseStatus(HttpStatus.OK)
    public void deleteTurmaById(
            @RequestParam("id") Long id
    ) {
        listaTurmas.removeIf(v -> Objects.equals(v.getId(), id));
    }
}
