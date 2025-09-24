package com.seuprojeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.seuprojeto.model.Disciplina;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
}

