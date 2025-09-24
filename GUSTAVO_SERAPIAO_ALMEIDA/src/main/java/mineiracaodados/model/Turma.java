package mineiracaodados.model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "turma")
public class Turma {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 120)
    private String nome;

    @Column(nullable = false)
    private Integer quantidadeAlunos;

    @OneToMany(mappedBy = "turma", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Disciplina> disciplinas = new ArrayList<>();

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public Integer getQuantidadeAlunos() { return quantidadeAlunos; }
    public void setQuantidadeAlunos(Integer quantidadeAlunos) { this.quantidadeAlunos = quantidadeAlunos; }
    public List<Disciplina> getDisciplinas() { return disciplinas; }
}
