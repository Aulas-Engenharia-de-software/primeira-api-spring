package com.lucasmartins.mineiracaodados.repository;

import com.lucasmartins.mineiracaodados.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
}