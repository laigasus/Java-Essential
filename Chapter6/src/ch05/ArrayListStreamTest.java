package ch05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("tomas");
        list.add("edward");
        list.add("jack");

        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
        // Stream.of(list).forEach(System.out::println);
        list.stream().map(s -> s.length()).forEach(System.out::println);
    }
}
