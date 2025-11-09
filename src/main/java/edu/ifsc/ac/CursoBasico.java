package edu.ifsc.ac;

public class CursoBasico implements Curso{
    private int cargaHoraria;
    public CursoBasico(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    public int cargaHoraria() {
        return cargaHoraria;
    }
}
