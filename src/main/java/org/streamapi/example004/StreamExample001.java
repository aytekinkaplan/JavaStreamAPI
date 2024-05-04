package org.streamapi.example004;

import java.util.List;
import java.util.stream.Stream;

public class StreamExample001 {

    public static void main(String[] args) {
        List<String> names = List.of("John", "Jane", "Jack", "Jill");
        new StreamExample001().method(names);
    }

    private void method(List<String> names) {
        Stream<String> stream = names.stream().filter(name -> name.startsWith("J")); // <1>
        stream.forEach(System.out::println);
    }
}
