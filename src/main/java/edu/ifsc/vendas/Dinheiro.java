
package edu.ifsc.vendas;

import java.math.BigDecimal;

public interface Dinheiro extends Comparable<Dinheiro> {
    BigDecimal quantia();
}
