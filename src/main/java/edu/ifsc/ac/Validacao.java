package edu.ifsc.ac;
public interface Validacao {
    RequerimentoAtividade requerimento();
    Professor avaliador();
    Parecer parecer();
    Horas validadas();
    void publicarEm(Validacoes destino);
}
