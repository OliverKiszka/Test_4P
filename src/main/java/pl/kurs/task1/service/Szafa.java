package pl.kurs.task1.service;

import pl.kurs.task1.models.Ubranie;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Szafa implements Iterable<Ubranie>{
    private List<Ubranie> ubrania;

    public Szafa() {
        ubrania = new ArrayList<>();
    }

    public List<Ubranie> getUbrania() {
        return ubrania;
    }

    public void dodajUbranie(Ubranie... noweUbrania) {
        for (Ubranie u : noweUbrania){
            if (ubrania.contains(u)){
                throw new IllegalArgumentException("Ubranie jest już w szafie: " +u);
            }
            ubrania.add(u);
        }
    }

    @Override
    public Iterator<Ubranie> iterator() {
        return ubrania.iterator();
    }
}
