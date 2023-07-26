package ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        for (int num : arr) {
            System.out.println(num);
        }

        Arrays.stream(arr).forEach(System.out::println);

        IntStream is = Arrays.stream(arr);
        System.out.println(is.sum());
        // System.out.println(is.max()); // 오류. Stream 매번 재생성 해야 함
    }
}
