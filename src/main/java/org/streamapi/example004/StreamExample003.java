package org.streamapi.example004;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamExample003 {
    public static void main(String[] args) {
        Stream.Builder<String> builder = Stream.builder();
        builder.add("John");
        builder.add("Jane");
        builder.add("Jack");
        builder.add("Jill");
        builder.add("Joe");
        builder.add("Jill");
        builder.add("Michael");
        builder.add("Sarah");
        builder.add("Emily");
        builder.add("David");
        builder.add("Olivia");
        builder.add("Michael");
        builder.add("Jessica");
        builder.add("Matthew");
        builder.add("Ava");
        builder.add("Andrew");
        builder.add("Sophia");
        builder.add("James");
        builder.add("Isabella");
        builder.add("Daniel");
        builder.add("Mia");
        builder.add("Ethan");
        builder.add("Charlotte");
        builder.add("Alexander");
        builder.add("Abigail");
        builder.add("Henry");
        builder.add("Sofia");

        new StreamExample003().method(builder);
    }

    private void method(Stream.Builder<String> builder) {
        builder.build().forEach(System.out::println);

    }
}
