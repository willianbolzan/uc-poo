
package edu.ifsc.vendas.dinheiro;


import edu.ifsc.vendas.Dinheiro;

import java.math.BigDecimal;

public final class NoNulls implements Dinheiro {
    private final Dinheiro origin;

    public NoNulls(final Dinheiro dinheiro) {
        this.origin = dinheiro;
    }

    @Override
    public BigDecimal quantia() {
        if (this.origin == null) {
            throw new IllegalArgumentException(
                "NULL ao invés de um dinheiro válido"
            );
        }
        final BigDecimal quantia = this.origin.quantia();
        if (quantia == null) {
            throw new IllegalStateException(
                "NULL ao invés de uma quantia válida"
            );
        }
        return quantia;
    }

    @Override
    public int compareTo(final Dinheiro dinheiro) {
        if (dinheiro == null) {
            throw new IllegalArgumentException(
                "NULL ao invés de um dinheiro válido"
            );
        }
        return this.origin.quantia().compareTo(dinheiro.quantia());
    }
}
