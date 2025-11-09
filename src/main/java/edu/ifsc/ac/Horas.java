package edu.ifsc.ac;
public interface Horas extends Comparable<Horas> {
    int emInteiros();
    Horas somadaA(Horas outras);
    Horas limitadaA(Horas limite);
    boolean menorQue(Horas outras);

    @Override
    default int compareTo(Horas o) {
        return Integer.compare(this.emInteiros(), o.emInteiros());
    }
}
