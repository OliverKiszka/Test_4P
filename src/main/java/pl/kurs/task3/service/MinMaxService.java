package pl.kurs.task3.service;

import pl.kurs.task3.models.MinMax;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class MinMaxService {


    public static <T extends Comparable<T>> MinMax<T> getMinAndMax(List<T> elements) {
        if (elements == null) {
            throw new IllegalArgumentException("Lista nie może być nullem!");
        }
        elements.removeIf(Objects::isNull);
        if (elements.isEmpty()) {
            throw new IllegalArgumentException("Lista nie może być pusta!");
        }
        T min = Collections.min(elements);
        T max = Collections.max(elements);

        return new MinMax<>(min, max);
    }
}
