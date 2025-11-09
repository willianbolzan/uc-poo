package edu.ifsc.vendas.nome;


import edu.ifsc.vendas.Nome;

public class NomeValido implements Nome {
    private Nome nome;
    public NomeValido(Nome nome) {
        this.nome = nome;

    }
    @Override
    public String valor() {
        String valor = nome.valor();
        if( valor.isBlank()) {
            throw new RuntimeException("nome nao pode ser nulo");
        }
        return valor;
    }
}
