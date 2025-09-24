package mineiracaodados.controller;

import mineiracaodados.model.Turma;
import mineiracaodados.repository.TurmaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    private final TurmaRepository turmaRepo;

    public TurmaController(TurmaRepository turmaRepo) {
        this.turmaRepo = turmaRepo;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Turma criar(@RequestBody Turma body) {
        return turmaRepo.save(body);
    }

    @GetMapping
    public List<Turma> listar() {
        return turmaRepo.findAll();
    }

    @GetMapping("/{id}")
    public Turma buscar(@PathVariable Long id) {
        return turmaRepo.findById(id).orElseThrow();
    }

    @PutMapping("/{id}")
    public Turma atualizar(@PathVariable Long id, @RequestBody Turma body) {
        Turma t = turmaRepo.findById(id).orElseThrow();
        t.setNome(body.getNome());
        t.setQuantidadeAlunos(body.getQuantidadeAlunos());
        return turmaRepo.save(t);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletar(@PathVariable Long id) {
        turmaRepo.deleteById(id);
    }
}
