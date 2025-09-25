package com.lucasmartins.mineiracaodados.repository;

import com.lucasmartins.mineiracaodados.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
    
    List<Disciplina> findByTurmaId(Long turmaId);
    
}