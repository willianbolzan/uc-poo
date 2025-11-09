package edu.ifsc.ac;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class RequerimentosEmMemoria implements Requerimentos {
    private final List<RequerimentoAtividade> todos = new ArrayList<>();

    @Override
    public void adicionar(RequerimentoAtividade req) {
        this.todos.add(req);
    }

    @Override
    public Requerimentos doAluno(Aluno aluno) {
        final RequerimentosEmMemoria filtrado = new RequerimentosEmMemoria();
        this.todos.stream()
                .filter(r -> r.autor().equals(aluno))
                .forEach(filtrado::adicionar);
        return filtrado;
    }

    @Override
    public Requerimentos pendentes() {
        // Como não ligamos um estado ainda, retornamos todos.
        final RequerimentosEmMemoria copia = new RequerimentosEmMemoria();
        this.todos.forEach(copia::adicionar);
        return copia;
    }

    @Override
    public java.util.Iterator<RequerimentoAtividade> iterator() {
        return this.todos.iterator();
    }

    @Override
    public String toString() {
        return this.todos.stream().map(Object::toString).collect(Collectors.joining("\n"));
    }
}
