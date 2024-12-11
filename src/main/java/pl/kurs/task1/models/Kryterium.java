package pl.kurs.task1.models;

import java.util.Comparator;

public enum Kryterium {
    ROZMIAR(Comparator.comparing(Ubranie::getSize, Rozmiary.comparator())),
    WARTOSC(Comparator.comparingDouble(Ubranie::getPrice));

    private final Comparator<Ubranie> comparator;


    Kryterium(Comparator<Ubranie> comparator) {
        this.comparator = comparator;
    }

    public Comparator<Ubranie> getComparator() {
        return comparator;
    }
}
