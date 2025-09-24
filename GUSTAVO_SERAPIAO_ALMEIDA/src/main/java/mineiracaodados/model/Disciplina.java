package mineiracaodados.model;

import jakarta.persistence.*;

@Entity
@Table(name = "disciplina")
public class Disciplina {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 200)
    private String descricao;

    @Column(name = "horas_aula", nullable = false, length = 20)
    private String horasAula;

    @Column(nullable = false, length = 120)
    private String curso;

    @Column(nullable = false, length = 120)
    private String professor;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "turma_id", nullable = false)
    private Turma turma; // criaremos a entidade Turma na próxima etapa

    // getters/setters
    public Long getId() { return id; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getHorasAula() { return horasAula; }
    public void setHorasAula(String horasAula) { this.horasAula = horasAula; }
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }
    public String getProfessor() { return professor; }
    public void setProfessor(String professor) { this.professor = professor; }
    public Turma getTurma() { return turma; }
    public void setTurma(Turma turma) { this.turma = turma; }
}


