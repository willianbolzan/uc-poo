package edu.ifsc.ac;
public final class HorasInteiras implements Horas {
    private final int horas;
    public HorasInteiras(final int horas) {
        if (horas < 0) throw new IllegalArgumentException("Horas negativas");
        this.horas = horas;
    }
    @Override
    public int emInteiros() { return this.horas; }
    @Override
    public Horas somadaA(Horas outras) {
        return new HorasInteiras(this.horas + outras.emInteiros());
    }
    @Override
    public Horas limitadaA(Horas limite) {
        return new HorasInteiras(Math.min(this.horas, limite.emInteiros()));
    }
    @Override
    public boolean menorQue(Horas outras) {
        return this.horas < outras.emInteiros();
    }
    @Override
    public String toString() { return this.horas + "h"; }
}
