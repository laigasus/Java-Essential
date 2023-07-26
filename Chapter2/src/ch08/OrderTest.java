package ch08;

public class OrderTest {
    public static void main(String[] args) {
        long no = 202011020003L;
        int phone = 01023450001;
        String address = "서울시 강남구 역삼동 111-333";
        int date = 20201102;
        int time = 130258;
        int price = 35000;
        int num = 0003;

        Order order = new OrderBuilder()
                .phone(phone).no(no).address(address)
                .date(date).time(time).price(price)
                .num(num).build();

        System.out.print(order);
    }
}