package edu.ifsc.vendas.cidades;



import edu.ifsc.vendas.Cidade;
import edu.ifsc.vendas.Cidades;

import java.util.ArrayList;
import java.util.List;

public class CidadesEmMemoria implements Cidades {
    private final List<Cidade> cidades = new ArrayList<>();

    @Override
    public void adiciona(Cidade cidade) {
        cidades.add(cidade);
    }

    public void listar() {
        for (Cidade c : cidades) {
            System.out.println(c);
        }
    }
}