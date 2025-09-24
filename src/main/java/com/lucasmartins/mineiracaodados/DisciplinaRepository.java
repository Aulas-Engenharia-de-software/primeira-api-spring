package com.lucasmartins.mineiracaodados;

import com.lucasmartins.mineiracaodados.model.DisciplinaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository<DisciplinaEntity, Integer> {
}
