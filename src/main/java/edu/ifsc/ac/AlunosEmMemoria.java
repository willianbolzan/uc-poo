package edu.ifsc.ac;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public final class AlunosEmMemoria implements Alunos {
    private final Map<Id, Aluno> porId;
    private final Map<String, Aluno> porNome;

    public AlunosEmMemoria() {
        this.porId = new HashMap<>();
        this.porNome = new HashMap<>();
    }

    @Override
    public Aluno adicionar(Aluno aluno) {
        // Indexa o aluno pelos dois identificadores
        porNome.put(aluno.nome().valor().toLowerCase(), aluno);
        return porId.put(aluno.id(), aluno);


    }

    @Override
    public Aluno com(Nome nome) {
        Aluno aluno = porNome.get(nome.valor().toLowerCase());
        if (aluno == null) {
            throw new IllegalArgumentException("Aluno não encontrado: " + nome.valor());
        }
        return aluno;
    }

    public Aluno com(Id id) {
        Aluno aluno = porId.get(id);
        if (aluno == null) {
            throw new IllegalArgumentException("Aluno não encontrado: " + id.numero());
        }
        return aluno;
    }

    @Override
    public Iterator<Aluno> iterator() {
        return porId.values().iterator();
    }
}

