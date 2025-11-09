package edu.ifsc.ac;
public final class ParecerDeferido implements Parecer {
    private final Descricao justificativa;
    public ParecerDeferido(final Descricao justificativa) {
        this.justificativa = justificativa;
    }
    @Override
    public Horas decidir(Horas solicitadas, Horas limite) {
        return solicitadas.limitadaA(limite);
    }
    @Override
    public Descricao justificativa() { return this.justificativa; }
    @Override
    public String toString() { return "Deferido: " + this.justificativa.texto(); }
}
