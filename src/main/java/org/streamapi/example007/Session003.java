package org.streamapi.example007;

import java.util.Arrays;
import java.util.List;

public class Session003 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        new Session003().method(names);
    }

    private void method(List<String> names) {
        System.out.println(names.stream().anyMatch(name -> name.length() > 3));
    }
}
