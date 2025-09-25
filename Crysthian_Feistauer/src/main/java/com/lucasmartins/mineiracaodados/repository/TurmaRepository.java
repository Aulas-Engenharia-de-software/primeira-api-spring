package com.lucasmartins.mineiracaodados.repository;

import com.lucasmartins.mineiracaodados.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long> {
    
}