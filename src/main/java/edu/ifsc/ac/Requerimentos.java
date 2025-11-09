package edu.ifsc.ac;
public interface Requerimentos extends Iterable<RequerimentoAtividade> {
    void adicionar(RequerimentoAtividade req);
    Requerimentos doAluno(Aluno aluno);
    Requerimentos pendentes();
}
