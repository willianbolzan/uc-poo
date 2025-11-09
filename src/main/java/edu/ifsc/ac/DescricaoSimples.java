package edu.ifsc.ac;
public final class DescricaoSimples implements Descricao {
    private final String valor;
    public DescricaoSimples(final String valor) {
        if (valor == null || valor.isBlank()) {
            throw new IllegalArgumentException("Descrição vazia");
        }
        this.valor = valor;
    }
    @Override
    public String texto() { return this.valor; }
    @Override
    public String toString() { return this.valor; }
}
