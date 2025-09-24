@OneToMany(mappedBy = "turma", cascade = CascadeType.ALL, orphanRemoval = true)
private List<Disciplina> disciplinas = new ArrayList<>();
