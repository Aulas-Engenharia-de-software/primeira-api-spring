package mineiracaodados.controller;

import mineiracaodados.model.Disciplina;
import mineiracaodados.model.Turma;
import mineiracaodados.repository.DisciplinaRepository;
import mineiracaodados.repository.TurmaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turmas/{turmaId}/disciplinas")
public class DisciplinaController {

    private final DisciplinaRepository disciplinaRepo;
    private final TurmaRepository turmaRepo;

    public DisciplinaController(DisciplinaRepository disciplinaRepo, TurmaRepository turmaRepo) {
        this.disciplinaRepo = disciplinaRepo;
        this.turmaRepo = turmaRepo;
    }

    // Listar disciplinas de uma turma
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Disciplina> listar(@PathVariable Long turmaId) {
        return disciplinaRepo.findByTurmaId(turmaId);
    }

    // Criar disciplina
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Disciplina criar(@PathVariable Long turmaId, @RequestBody Disciplina body) {
        Turma turma = turmaRepo.findById(turmaId)
                .orElseThrow(() -> new RuntimeException("Turma não encontrada"));
        body.setTurma(turma);
        return disciplinaRepo.save(body);
    }

    // Atualizar disciplina
    @PutMapping("/{disciplinaId}")
    @ResponseStatus(HttpStatus.OK)
    public Disciplina atualizar(@PathVariable Long turmaId,
                                @PathVariable Long disciplinaId,
                                @RequestBody Disciplina body) {
        Disciplina d = disciplinaRepo.findById(disciplinaId)
                .orElseThrow(() -> new RuntimeException("Disciplina não encontrada"));
        if (!d.getTurma().getId().equals(turmaId)) {
            throw new RuntimeException("Turma inválida");
        }
        d.setDescricao(body.getDescricao());
        d.setHorasAula(body.getHorasAula());
        d.setCurso(body.getCurso());
        d.setProfessor(body.getProfessor());
        return disciplinaRepo.save(d);
    }

    // Deletar disciplina
    @DeleteMapping("/{disciplinaId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Long turmaId, @PathVariable Long disciplinaId) {
        Disciplina d = disciplinaRepo.findById(disciplinaId)
                .orElseThrow(() -> new RuntimeException("Disciplina não encontrada"));
        if (!d.getTurma().getId().equals(turmaId)) {
            throw new RuntimeException("Turma inválida");
        }
        disciplinaRepo.delete(d);
    }
}

