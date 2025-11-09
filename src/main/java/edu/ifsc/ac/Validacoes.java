package edu.ifsc.ac;
public interface Validacoes extends Iterable<Validacao> {
    void adicionar(Validacao validacao);
    Validacoes doAluno(Aluno aluno);
    Validacoes por(Professor professor);
}
