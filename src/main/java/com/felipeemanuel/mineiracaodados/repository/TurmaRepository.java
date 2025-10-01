package com.felipeemanuel.mineiracaodados.repository;

import com.felipeemanuel.mineiracaodados.model.TurmaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends CrudRepository<TurmaEntity, Integer> {

    /**
     * select * from turma where nome = '?'
     *
     * @param nome
     * @return
     */
    TurmaEntity findByNome(String nome);

    /**
     * select * from turma where curso = '?'
     *
     * @param curso
     * @return
     */
    TurmaEntity findByCurso(String curso);

    /**
     * select * from turma where nome = '?' and curso = '?';
     */
    TurmaEntity findByNomeAndCurso(String nome, String curso);

}