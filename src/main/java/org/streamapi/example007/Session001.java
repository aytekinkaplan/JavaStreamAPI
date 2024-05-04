package org.streamapi.example007;

import java.util.List;
import java.util.stream.Collectors;

public class Session001 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = new Session001().getEvenNumbers(numbers);
        new Session001().printEvenNumbers(evenNumbers);
    }

    private void printEvenNumbers(List<Integer> evenNumbers) {
        System.out.println("Even numbers: ");
        evenNumbers.forEach(System.out::println);
    }

    private List<Integer> getEvenNumbers(List<Integer> numbers) {
        return numbers.stream().filter(number -> number % 2 == 0).collect(Collectors.toList());
    }
}
