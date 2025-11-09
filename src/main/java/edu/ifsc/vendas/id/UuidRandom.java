package edu.ifsc.vendas.id;


import edu.ifsc.vendas.Id;

import java.util.Objects;
import java.util.UUID;

public class UuidRandom implements Id, Comparable<UuidRandom> {
    private final Id origin;

    public UuidRandom() {
        this.origin = new Uuid(UUID.randomUUID().toString());
    }

    @Override
    public String numero() {
        return this.origin.numero();
    }

    @Override
    public boolean equals(final Object obj) {
        return this == obj || obj instanceof UuidRandom
                && UuidRandom.class.cast(obj).numero().equals(this.numero());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.numero());
    }

    @Override
    public String toString() {
        return this.numero();
    }

    @Override
    public int compareTo(final UuidRandom uuid) {
        return this.numero().compareTo(uuid.numero());
    }
}
