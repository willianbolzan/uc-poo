package edu.ifsc.ac;
public final class NomeSimples implements Nome {
    private final String valor;
    public NomeSimples(final String valor) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("Nome vazio");
        }
        this.valor = valor;
    }
    @Override
    public String valor() { return this.valor; }
    @Override
    public String toString() { return this.valor; }
}
