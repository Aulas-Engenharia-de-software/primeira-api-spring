package model;

import jakarta.persistence.*;

@Entity
@Table(name = "disciplina")
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    @Column(name = "horas_aula")
    private String horasAula;

    private String curso;

    private String professor;

    // Muitas disciplinas pertencem a uma Turma
    @ManyToOne
    @JoinColumn(name = "turma_id", nullable = false)
    private Turma turma;
}
