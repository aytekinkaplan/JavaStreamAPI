package org.streamapi.example007;

import java.util.List;

public class Session002 {
    public static void main(String[] args) {
        List<String> names = List.of("John", "Jane", "Jack", "Jill");
        new Session002().method(names);
    }

    private void method(List<String> names) {
        System.out.println("All names");
        names.forEach(System.out::println);
        System.out.println("All names starting with 'J'");
        names.stream().filter(name -> name.startsWith("J")).forEach(System.out::println);
        System.out.println("All names in uppercase");
        names.stream().map(String::toUpperCase).forEach(System.out::println);
        System.out.println("All names in lowercase and trimmed");
        names.stream().map(String::toLowerCase).forEach(System.out::println);
        names.stream().map(String::trim).forEach(System.out::println);
        System.out.println("All names in lowercase and trimmed and length > 3");
        names.stream().map(String::trim).filter(name -> name.length() > 3).forEach(System.out::println);

    }
}
