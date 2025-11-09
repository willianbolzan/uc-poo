package edu.ifsc.ac;
public interface RequerimentoAtividade {
    Aluno autor();
    AtividadeReferencia referencia();
    Horas declaradas();
    Documentacao documento();
    void registrarEm(Requerimentos destino);
}
