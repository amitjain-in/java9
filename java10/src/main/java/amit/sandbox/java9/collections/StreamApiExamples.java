package amit.sandbox.java9.collections;

import java.util.List;

public class StreamApiExamples {

    public static void main(String[] args) {
        //List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> numbers = List.of(1, 2, 3, 6, 4, 5);
//        numbers.stream().takeWhile(i -> i < 4).forEach(System.out::println);
        numbers.stream().takeWhile(i -> (i % 3) == 0).forEach(System.out::println);
        numbers.forEach(i -> System.out.println(i % 3));
    }
}
