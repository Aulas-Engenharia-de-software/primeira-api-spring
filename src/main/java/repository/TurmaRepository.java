package repository;

import model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import model.Turma;

import java.util.List;

public interface TurmaRepository extends JpaRepository<Turma, Long> {

}
