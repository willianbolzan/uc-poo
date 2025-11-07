package edu.ifsc.vendas.idade;

import edu.ifsc.vendas.DataDeNascimento;
import edu.ifsc.vendas.Idade;

import java.time.LocalDate;
import java.time.Period;

public class IdadeBasica implements Idade {
    private DataDeNascimento dataDeNascimemto;

    public IdadeBasica(DataDeNascimento dataDeNascimemto) {
        this.dataDeNascimemto = dataDeNascimemto;
    }

    @Override
    public int valor() {
        return Period.between(this.dataDeNascimemto.dataDeNascimento(), LocalDate.now()).getYears();
    }

}
