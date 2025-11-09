package edu.ifsc.ac;


import java.util.List;

public interface Menu {
    void adicionar(Opcao opcao);
    List<Opcao> opcoes();
    String titulo();
    void exibir();
}
