package com.lucasmartins.mineiracaodados.config;

import com.lucasmartins.mineiracaodados.model.Disciplina;
import com.lucasmartins.mineiracaodados.model.Turma;
import com.lucasmartins.mineiracaodados.repository.DisciplinaRepository;
import com.lucasmartins.mineiracaodados.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer implements CommandLineRunner {

    @Autowired
    private TurmaRepository turmaRepository;

    @Autowired
    private DisciplinaRepository disciplinaRepository;

    @Override
    public void run(String... args) throws Exception {
        // Criar turma inicial
        Turma turma = new Turma("T03N", 30);
        turma = turmaRepository.save(turma);

        // Criar disciplinas para a turma
        Disciplina disciplina1 = new Disciplina("Engenharia de Software", "60", "Engenharia de Computação", "Prof. Lucas");
        disciplina1.setTurma(turma);
        disciplinaRepository.save(disciplina1);

        Disciplina disciplina2 = new Disciplina("Estruturas de Dados", "80", "Engenharia de Computação", "Prof. Maria");
        disciplina2.setTurma(turma);
        disciplinaRepository.save(disciplina2);

        System.out.println("Dados iniciais criados com sucesso!");
    }
}