package ch07;

import java.util.ArrayList;
import java.util.List;

public class TravelTest {
    public static void main(String[] args) {
        List<TravelCustomer> customers = new ArrayList<>();

        customers.addAll(List.of(
                new TravelCustomer("이순신", 40, 100),
                new TravelCustomer("김유신", 20, 100),
                new TravelCustomer("홍길동", 13, 50)));

        System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
        customers.stream().forEach(c -> System.out.println(c.getName()));

        int total = customers.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println("총 여행 비용은 " + total + "입니다");

        System.out.println("== 20세 이상 고객 명단 정렬하여 출력 ==");
        customers.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(System.out::println);
    }
}