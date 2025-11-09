package edu.ifsc.ac;
public final class DocumentacaoSimples implements Documentacao {
    private final Descricao tipo;
    private final String referencia; // ex: URL, caminho, hash

    public DocumentacaoSimples(final Descricao tipo, final String referencia) {
        this.tipo = tipo;
        this.referencia = referencia;
    }

    @Override
    public void validar() {
        if (this.referencia == null || this.referencia.isBlank()) {
            throw new IllegalArgumentException("Documentação sem referência");
        }
    }

    @Override
    public Descricao tipo() {
        return this.tipo;
    }

    @Override
    public String toString() {
        return this.tipo.texto() + ": " + this.referencia;
    }
}
