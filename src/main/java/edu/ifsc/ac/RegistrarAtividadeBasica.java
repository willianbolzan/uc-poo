package edu.ifsc.ac;

public final class RegistrarAtividadeBasica implements RegistrarAtividade {
    @Override
    public AtividadeComplementar executar(Aluno aluno, AtividadeComplementar referencia, int horas) {
        return aluno.registrar(referencia, horas);
    }
}