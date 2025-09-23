package repository;
import org.springframework.data.jpa.repository.JpaRepository;
import model.Disciplina;

import java.util.List;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
        // Aqui você pode criar métodos extras, se precisar, por exemplo:
        List<Disciplina> findByCurso(String curso);
        List<Disciplina> findByProfessor(String professor);
        List<Disciplina> findByHorasAula(String horasAula);
        List<Disciplina> findByDescricao(String descricao);
    }
