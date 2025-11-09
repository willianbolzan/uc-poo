package edu.ifsc.ac;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class ValidacoesEmMemoria implements Validacoes {
    private final List<Validacao> todas = new ArrayList<>();

    @Override
    public void adicionar(Validacao validacao) {
        this.todas.add(validacao);
    }

    @Override
    public Validacoes doAluno(Aluno aluno) {
        final ValidacoesEmMemoria filtrado = new ValidacoesEmMemoria();
        this.todas.stream()
                .filter(v -> v.requerimento().autor().equals(aluno))
                .forEach(filtrado::adicionar);
        return filtrado;
    }

    @Override
    public Validacoes por(Professor professor) {
        final ValidacoesEmMemoria filtrado = new ValidacoesEmMemoria();
        this.todas.stream()
                .filter(v -> v.avaliador().equals(professor))
                .forEach(filtrado::adicionar);
        return filtrado;
    }

    @Override
    public java.util.Iterator<Validacao> iterator() {
        return this.todas.iterator();
    }

    @Override
    public String toString() {
        return this.todas.stream().map(Object::toString).collect(Collectors.joining("\n"));
    }
}
