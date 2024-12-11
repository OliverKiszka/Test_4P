package pl.kurs.task3.app;

import pl.kurs.task3.models.Employee;
import pl.kurs.task3.models.MinMax;
import pl.kurs.task3.service.MinMaxService;

import java.util.Arrays;
import java.util.List;

public class MinMaxRunner {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(2,5,1,12,55);
        List<String> stringList = Arrays.asList("kubek", "okulary", "telefon", "słuchawki", "klucze");
        List<Employee> employeeList = Arrays.asList(
                new Employee("Jon", 32, 12_000),
                new Employee("Tyrion", 55, 15_000),
                new Employee("Daenerys", 41, 25_000)
        );
        MinMax<Integer> result1 = MinMaxService.getMinAndMax(integerList);
        System.out.println("Min: " + result1.getMin());
        System.out.println("Max: " + result1.getMax());

        MinMax<String> result2 = MinMaxService.getMinAndMax(stringList);
        System.out.println("Min: " + result2.getMin());
        System.out.println("Max: " + result2.getMax());

        MinMax<Employee> result3 = MinMaxService.getMinAndMax(employeeList);
        System.out.println("Min: " + result3.getMin());
        System.out.println("Max: " + result3.getMax());
    }

}
