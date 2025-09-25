package com.enzo.atividade.dois.repositories;

import com.enzo.atividade.dois.MineiracaodadosApplication;
import com.enzo.atividade.dois.model.DisciplinaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DisciplinaRepository extends JpaRepository<DisciplinaEntity, Long> {
}
