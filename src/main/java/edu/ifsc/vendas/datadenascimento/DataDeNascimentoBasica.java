package edu.ifsc.vendas.datadenascimento;


import edu.ifsc.vendas.DataDeNascimento;

import java.time.LocalDate;

public class DataDeNascimentoBasica implements DataDeNascimento {
    private LocalDate dataNascimento;
    public DataDeNascimentoBasica(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    @Override
    public LocalDate data() {
        return this.dataNascimento;
    }
}
