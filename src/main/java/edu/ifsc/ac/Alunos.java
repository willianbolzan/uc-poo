package edu.ifsc.ac;


// Coleção de alunos
public interface Alunos extends Iterable<Aluno> {
    Aluno adicionar(Aluno aluno);
    Aluno com(Nome nome); // ou por id/matrícula, conforme seu modelo
}

