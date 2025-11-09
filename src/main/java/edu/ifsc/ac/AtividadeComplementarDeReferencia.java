package edu.ifsc.ac;

public final class AtividadeComplementarDeReferencia implements AtividadeComplementar {
    private final Nome descricao;
    private final Modalidade modalidade;
    private final int limite;

    public AtividadeComplementarDeReferencia(Nome descricao,
                                             Modalidade modalidade,
                                             int limite) {
        this.descricao = descricao;
        this.modalidade = modalidade;
        this.limite = limite;
    }

    @Override
    public Nome descricao() { return this.descricao; }

    @Override
    public Modalidade modalidade() { return this.modalidade; }



    @Override
    public int horas() { return this.limite; }


    @Override
    public String toString() {
        return this.descricao.valor() + " (" + this.modalidade + ", limite " + this.limite + ")";
    }
}
