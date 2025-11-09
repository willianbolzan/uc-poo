package edu.ifsc.ac;

import java.util.List;

public final class AlunoComAtividadesPersistidas implements Aluno {
    private final Aluno inner;
    private final AtividadesDoAluno store; // << CORRETO: coleção de ATIVIDADES do aluno

    public AlunoComAtividadesPersistidas(Aluno inner, AtividadesDoAluno store) {
        this.inner = inner;
        this.store = store;
    }
    @Override public Id id() { return inner.id(); }
    @Override public Nome nome() { return inner.nome(); }
    @Override public Curso curso() { return inner.curso(); }
    @Override public List<AtividadeComplementar> atividades() { return inner.atividades(); }



    // Versão que retorna a atividade criada (se optar por esse estilo):
     public AtividadeComplementar registrar(AtividadeComplementar referencia, int horas) {
         var r = new AtividadeComplementarRascunho(referencia, horas);
         store.adicionar(r);
         inner.registrar(referencia, horas);
         return r;
     }
}
