package edu.ifsc.ac;
public final class ModalidadeSimples implements Modalidade {
    private final Id id;
    private final Nome nome;
    private final double porcentagemlimite;

    public ModalidadeSimples(final Id id,final Nome nome, final double porcentagemlimite) {
        this.id = id;
        this.nome = nome;
        this.porcentagemlimite = porcentagemlimite;
    }

    @Override
    public Id id() {
        return id;
    }

    @Override
    public Nome nome() { return this.nome; }

    @Override
    public double porcentagemLimite() {
        return this.porcentagemlimite;
    }

    @Override
    public String toString() { return this.nome.valor(); }
}
