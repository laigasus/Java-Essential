package ch02;

public class AddTest {
    public static void main(String[] args) {
        Add add = (x, y) -> {
            return x + y;
        };

        System.out.println(add.add(1, 2));
    }
}
