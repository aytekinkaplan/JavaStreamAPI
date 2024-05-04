package org.streamapi.example007;

import java.util.List;
import java.util.stream.Collectors;

public class Session004 {
    public static void main(String[] args) {
        List<String> names = List.of("Michael", "Sarah", "Emily", "David", "Olivia", "Jessica", "Matthew", "Ava", "Ethan", "Charlotte", "Alexander", "Abigail", "Henry", "Sofia");
        new Session004().method(names);
    }

    private void method(List<String> names) {
        System.out.println("Names with length > 5: ");
        names.stream().filter(name -> name.length() > 5).forEach(System.out::println);
        List<Integer> lengths = names.stream().map(String::length).toList();
        new Session004().method1(lengths);
    }

    private void method1(List<Integer> lengths) {
        lengths.stream().filter(length -> length > 5).forEach(System.out::println);
    }
}
