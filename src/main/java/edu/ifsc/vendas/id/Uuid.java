package edu.ifsc.vendas.id;


import edu.ifsc.vendas.Id;

import java.util.Objects;

public class Uuid implements Id, Comparable<Uuid> {

    private final String numero;

    public Uuid(final String numero) {
        this.numero = numero;
    }

    @Override
    public String numero() {
        return this.numero;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Id)) return false;
        return this.numero.equals(((Id) obj).numero());
    }


    @Override
    public int hashCode() {
        return Objects.hash(this.numero);
    }

    @Override
    public String toString() {
        return this.numero;
    }

    @Override
    public int compareTo(final Uuid uuid) {
        return this.numero.compareTo(uuid.numero);
    }
}
