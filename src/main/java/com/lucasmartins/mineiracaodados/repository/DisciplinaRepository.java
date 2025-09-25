package com.lucasmartins.mineiracaodados.repository;

import com.lucasmartins.mineiracaodados.model.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long> {
    // Métodos de busca customizados podem ser adicionados aqui se necessário
}