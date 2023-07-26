package ch03;

public class MyNumberTest {

    public static void main(String[] args) {
        MyNumber myNumber = (n1, n2) -> {
            return Math.max(n1, n2);
        };

        System.out.println(myNumber.getMax(10, 20));
    }
}
