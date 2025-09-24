const express = require("express");
const app = express();
app.use(express.json());

// Mock de dados (simulação de banco)
let turmas = [
  { id: "T01N", disciplina: "Matemática" },
  { id: "T02N", disciplina: "História" },
];

// 📌 Criar uma turma
app.post("/turma", (req, res) => {
  const { id, disciplina } = req.body;
  turmas.push({ id, disciplina });
  res.status(201).send(`Turma ${id} criada`);
});

// 📌 Atualizar uma turma
app.put("/turma/:id", (req, res) => {
  const { id } = req.params;
  const { disciplina } = req.body;

  let turma = turmas.find((t) => t.id === id);
  if (!turma) {
    return res.status(404).send("Turma não encontrada");
  }

  turma.disciplina = disciplina;
  res.status(200).send(`Turma ${id} atualizada`);
});

// 📌 Deletar uma turma
app.delete("/turma/:id", (req, res) => {
  const { id } = req.params;
  turmas = turmas.filter((t) => t.id !== id);
  res.status(204).send(); // No Content
});

// 📌 Consultar a disciplina de uma turma
app.get("/turma/:id/disciplina", (req, res) => {
  const { id } = req.params;
  const turma = turmas.find((t) => t.id === id);

  if (!turma) {
    return res.status(404).send("Turma não encontrada");
  }

  res.status(200).json({ disciplina: turma.disciplina });
});

// 🚀 Subir servidor
app.listen(3000, () => {
  console.log("API rodando em http://localhost:3000");
});
