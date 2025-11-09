package edu.ifsc.ac;
public final class ProfessorBasico implements Professor {
    private final Nome nome;
    public ProfessorBasico(final Nome nome) {
        this.nome = nome;
    }
    @Override
    public Validacao validar(RequerimentoAtividade requerimento, Parecer parecer, Horas horasValidadas) {
        // A quantidade efetiva segue a decisão do Parecer limitada pelo limite da atividade
        final Horas limite = requerimento.referencia().limite();
        final Horas decisão = parecer.decidir(horasValidadas, limite);
        return new ValidacaoBasica(requerimento, this, parecer, decisão);
    }
    @Override
    public String toString() { return "Professor(" + this.nome.valor() + ")"; }
}
