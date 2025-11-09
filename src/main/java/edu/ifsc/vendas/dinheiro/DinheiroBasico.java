
package edu.ifsc.vendas.dinheiro;


import edu.ifsc.vendas.Dinheiro;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Objects;

public final class DinheiroBasico implements Dinheiro {
    private final BigDecimal quantia;
    private final Currency moeda;
    private final Locale localizacao;

    public DinheiroBasico(final String quantia) {
        this(new BigDecimal(quantia));
    }

    public DinheiroBasico(final BigDecimal quantia) {
        this(
            quantia,
            Currency.getInstance("BRL"),
            new Locale.Builder().setLanguageTag("pt-BR").build()
        );
    }

    public DinheiroBasico(
        final BigDecimal quantia,
        final Currency moeda,
        final Locale localizacao
    ) {
        this.quantia = quantia;
        this.moeda = moeda;
        this.localizacao = localizacao;
    }

    @Override
    public BigDecimal quantia() {
        return this.quantia;
    }

    @Override
    public String toString() {
        final NumberFormat formatoMoeda = NumberFormat.getInstance(
            this.localizacao
        );
        formatoMoeda.setMinimumFractionDigits(
            this.moeda.getDefaultFractionDigits()
        );
        return String.format(
            "%s %s",
            this.moeda.getSymbol(this.localizacao),
            formatoMoeda.format(this.quantia)
        );
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final DinheiroBasico dinheiro = (DinheiroBasico) obj;
        return Objects.equals(
            this.quantia,
            dinheiro.quantia
        ) && Objects.equals(
            this.moeda,
            dinheiro.moeda
        ) && Objects.equals(this.localizacao, dinheiro.localizacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.quantia, this.moeda, this.localizacao);
    }

    @Override
    public int compareTo(final Dinheiro dinheiro) {
        return this.quantia.compareTo(dinheiro.quantia());
    }
}
