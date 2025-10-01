package com.aquilesdaniel.mineiracaodados.repository;

import org.springframework.data.repository.CrudRepository;

import com.aquilesdaniel.mineiracaodados.model.TurmaEntity;

public interface TurmaRepository extends CrudRepository<TurmaEntity, Integer>{
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