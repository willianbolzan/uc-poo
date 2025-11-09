package edu.ifsc.ac;

import java.util.ArrayList;
import java.util.List;

public final class AlunoBasico implements Aluno {
    private final Id id;
        private final Nome nome;
        private final Curso curso;
        private final List<AtividadeComplementar> atividades;

        public AlunoBasico(Id id, Nome nome, Curso curso) {
            this.id = id;
            this.nome = nome;
            this.curso = curso;
            this.atividades = new ArrayList<>();
        }

    @Override
    public Id id() {
        return this.id;
    }

    @Override public Nome nome() { return nome; }
        @Override public Curso curso() { return curso; }
        @Override public List<AtividadeComplementar> atividades() {
            return List.copyOf(atividades); }

    // Se preferir o estilo “retorna o que faz”:
     public AtividadeComplementar registrar(AtividadeComplementar referencia, int horas) {
         var r = new AtividadeComplementarRascunho(referencia, horas);
         atividades.add(r);
         return r;
     }
    }

