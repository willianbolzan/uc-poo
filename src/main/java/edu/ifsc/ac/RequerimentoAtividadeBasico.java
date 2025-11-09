package edu.ifsc.ac;
public final class RequerimentoAtividadeBasico implements RequerimentoAtividade {
    private final Aluno autor;
    private final AtividadeReferencia referencia;
    private final Horas declaradas;
    private final Documentacao documento;

    public RequerimentoAtividadeBasico(Aluno autor,
                                       AtividadeReferencia referencia,
                                       Horas declaradas,
                                       Documentacao documento) {
        this.autor = autor;
        this.referencia = referencia;
        this.declaradas = declaradas;
        this.documento = documento;
    }

    @Override
    public Aluno autor() { return this.autor; }

    @Override
    public AtividadeReferencia referencia() { return this.referencia; }

    @Override
    public Horas declaradas() { return this.declaradas; }

    @Override
    public Documentacao documento() { return this.documento; }

    @Override
    public void registrarEm(Requerimentos destino) {
        destino.adicionar(this);
    }

    @Override
    public String toString() {
        return "Req{" + autor + ", " + referencia + ", " + declaradas + ", " + documento + "}";
    }
}
