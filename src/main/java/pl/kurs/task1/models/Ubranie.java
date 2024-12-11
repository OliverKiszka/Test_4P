package pl.kurs.task1.models;

import java.util.Comparator;
import java.util.Objects;

public class Ubranie implements Comparable<Ubranie>{
    private String name;
    private Rozmiary size;
    private double price;
    private static Comparator<Ubranie> kryteriumSortowania;

    public Ubranie(String name, Rozmiary size, double price) {
        this.name = name;
        this.size = size;
        this.price = price;
        kryteriumSortowania = Comparator.comparing(x -> x.size, Rozmiary.comparator());

    }

    public String getName() {
        return name;
    }

    public Rozmiary getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }
    public static void ustalKryteriumSortowania(Kryterium kryterium){
        kryteriumSortowania = kryterium.getComparator();
    }
    @Override
    public int compareTo(Ubranie o) {
        return kryteriumSortowania.compare(this,o);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ubranie ubranie = (Ubranie) o;
        return Double.compare(ubranie.price, price) == 0 && Objects.equals(name, ubranie.name) && Objects.equals(size, ubranie.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, size, price);
    }

    @Override
    public String toString() {
        return "Ubranie{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
