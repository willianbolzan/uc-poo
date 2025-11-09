package edu.ifsc.ac;


// Coleção de atividades de UM aluno específico
public interface AtividadesDoAluno extends Iterable<AtividadeComplementar> {
    void adicionar(AtividadeComplementar atividade);
}

