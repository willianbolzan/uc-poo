package edu.ifsc.ac;
public final class ValidacaoBasica implements Validacao {
    private final RequerimentoAtividade requerimento;
    private final Professor avaliador;
    private final Parecer parecer;
    private final Horas validadas;

    public ValidacaoBasica(RequerimentoAtividade requerimento,
                           Professor avaliador,
                           Parecer parecer,
                           Horas validadas) {
        this.requerimento = requerimento;
        this.avaliador = avaliador;
        this.parecer = parecer;
        this.validadas = validadas;
    }

    @Override
    public RequerimentoAtividade requerimento() { return this.requerimento; }

    @Override
    public Professor avaliador() { return this.avaliador; }

    @Override
    public Parecer parecer() { return this.parecer; }

    @Override
    public Horas validadas() { return this.validadas; }

    @Override
    public void publicarEm(Validacoes destino) {
        destino.adicionar(this);
    }

    @Override
    public String toString() {
        return "Validacao{" + parecer + ", horas=" + validadas + "}";
    }
}
