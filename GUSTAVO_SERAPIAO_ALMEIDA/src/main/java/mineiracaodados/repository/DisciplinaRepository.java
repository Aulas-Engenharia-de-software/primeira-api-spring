package mineiracaodados.repository;

import mineiracaodados.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
    List<Disciplina> findByTurmaId(Long turmaId);
}
