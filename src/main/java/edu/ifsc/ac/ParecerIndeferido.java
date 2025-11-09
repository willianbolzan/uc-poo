package edu.ifsc.ac;
public final class ParecerIndeferido implements Parecer {
    private final Descricao justificativa;
    public ParecerIndeferido(final Descricao justificativa) {
        this.justificativa = justificativa;
    }
    @Override
    public Horas decidir(Horas solicitadas, Horas limite) {
        return new HorasInteiras(0);
    }
    @Override
    public Descricao justificativa() { return this.justificativa; }
    @Override
    public String toString() { return "Indeferido: " + this.justificativa.texto(); }
}
