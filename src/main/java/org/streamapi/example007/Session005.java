package org.streamapi.example007;

import java.util.List;

public class Session005 {
    public static void main(String[] args) {
        List<String> countries = List.of("USA", "Canada", "Mexico", "Brazil", "Chile", "Argentina");
        new Session005().method(countries);
    }

    private void method(List<String> countries) {
        System.out.println("Number of countries with length > 4: ");
        System.out.println(countries.stream().filter(country -> country.length() > 4).map(String::toUpperCase).count());
    }
}
