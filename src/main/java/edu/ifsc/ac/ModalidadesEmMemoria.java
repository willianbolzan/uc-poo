package edu.ifsc.ac;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class ModalidadesEmMemoria implements Modalidades {
    private final Map<Id, Modalidade> porId;
    private final Map<String, Modalidade> porNome;

    public ModalidadesEmMemoria() {
        this.porId = new HashMap<>();
        this.porNome = new HashMap<>();
    }

    @Override
    public Modalidade com(Id id) {
        Modalidade m = porId.get(id);
        if (m == null) {
            throw new IllegalArgumentException("Modalidade não encontrada com id: " + id);
        }
        return m;
    }


    @Override
    public Modalidade adicionar(Modalidade modalidade) {

        porNome.put(modalidade.nome().valor().toLowerCase(), modalidade);
        return  porId.put(modalidade.id(), modalidade);
    }

    @Override
    public Iterator<Modalidade> iterator() {
        return porId.values().iterator();
    }
}

