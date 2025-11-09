package edu.ifsc.ac;

public class AtividadeComplementarRascunho implements AtividadeComplementar {
    @Override
    public Nome descricao() {
        return null;
    }

    @Override
    public Modalidade modalidade() {
        return null;
    }

    @Override
    public int horas() {
        return 0;
    }

    public AtividadeComplementarRascunho(AtividadeComplementar referencia, int horas) {
    }
}
