package pl.kurs.task1.app;

import pl.kurs.task1.models.Kryterium;
import pl.kurs.task1.models.Rozmiary;
import pl.kurs.task1.models.Ubranie;
import pl.kurs.task1.service.Szafa;

import java.util.Collections;

public class SzafaRunner {
    public static void main(String[] args) {

        Ubranie koszulka = new Ubranie("Koszulka Metallica", Rozmiary.XL, 75);
        Ubranie spodnie = new Ubranie("Zielone dresy", Rozmiary.M, 150);
        Ubranie majtki = new Ubranie("Żabie stringi" , Rozmiary.XS, 69);



        Szafa szafa = new Szafa();

        szafa.dodajUbranie(koszulka, spodnie, majtki);


        for (Ubranie u : szafa){
            System.out.println(u);
        }
        Ubranie najwieksze = Collections.max(szafa.getUbrania());
        System.out.println("Największe ubranie: " + najwieksze);

        Ubranie.ustalKryteriumSortowania(Kryterium.WARTOSC);

        Ubranie najdrozsze = Collections.max(szafa.getUbrania());
        System.out.println("Najdroższe ubranie: " + najdrozsze);
    }
}
