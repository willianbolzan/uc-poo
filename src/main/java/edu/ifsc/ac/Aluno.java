package edu.ifsc.ac;



import java.util.List;

public interface Aluno {
    Id id();
    Nome nome();
    Curso curso();
    List<AtividadeComplementar> atividades();
    AtividadeComplementar registrar(AtividadeComplementar referencia, int horas);
}

