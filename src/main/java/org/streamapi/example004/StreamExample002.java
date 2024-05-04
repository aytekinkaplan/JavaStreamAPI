package org.streamapi.example004;

import java.util.Comparator;
import java.util.List;

public class StreamExample002 {

    public static void main(String[] args) {
        List<String> countries = List.of("USA", "India", "China", "Japan");
        new StreamExample002().method(countries);
    }

    private void method(List<String> countries) {
        countries.stream().sorted().forEach(System.out::println);
        countries.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        countries.stream().sorted(String::compareTo).forEach(System.out::println);
    }
}
