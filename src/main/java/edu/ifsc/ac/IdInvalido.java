package edu.ifsc.ac;

import edu.ifsc.vendas.Id;

public class IdInvalido implements Id {
    @Override
    public String numero() {
        return "Inválido";
    }
}
