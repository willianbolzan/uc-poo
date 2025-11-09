package edu.ifsc.ac;

public interface AtividadeReferencia {
    Descricao descricao();
    Modalidade modalidade();
    Horas limite();
    void exigir(Documentacao doc);
}
