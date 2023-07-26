package ch13;

import java.util.Scanner;

public class ConditionTest {
    public static void main(String[] args) {

        int max;
        System.out.println("입력 받은 두 수중 큰 수를 출력하세요\n ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력1:");
        int x = scanner.nextInt();
        System.out.print("입력2:");
        int y = scanner.nextInt();

        max = (x > y) ? x : y;
        scanner.close();
        System.out.println(max);
    }
}