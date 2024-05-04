package org.streamapi.example004;

import java.util.List;
import java.util.stream.Stream;

public class StreamExample004 {
    public static void main(String[] args) {
        Stream.Builder<String> builder = Stream.builder();

        builder.add("John").add("Jane").add("Jack").add("Jill").add("Michael").add("Sarah").add("Emily").add("David").
                add("Olivia").add("Jessica").add("Matthew").add("Ava").add("Ethan").add("Charlotte").add("Alexander").
                add("Abigail").add("Henry").add("Sofia");

        new StreamExample004().method(builder);
    }

    private void method(Stream.Builder<String> builder) {
        builder.build().forEach(System.out::println);
    }
}
