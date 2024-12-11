package pl.kurs.task1.models;

import java.util.Comparator;

public enum Rozmiary {
    XS,
    S,
    M,
    L,
    XL,
    XXL,
    XXXL;
    public static Comparator<Rozmiary> comparator(){
        return Comparator.comparingInt(Rozmiary::ordinal);
    }
}
