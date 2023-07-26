package ch08;

public class Order {
    private long no;
    private int phone;
    private String address;
    private int date;
    private int time;
    private int price;
    private int num;

    public Order(
            long no, int phone, String address,
            int date, int time, int price, int num) {
        this.no = no;
        this.phone = phone;
        this.address = address;
        this.date = date;
        this.time = time;
        this.price = price;
        this.num = num;
    }

    @Override
    public String toString() {
        return "주문 접수 번호 : " + no + '\n' +
                "주문 핸드폰 번호 : " + phone + '\n' +
                "주문 집 주소 : " + address + '\n' +
                "주문 날짜 : " + date + '\n' +
                "주문 시간 : " + time + '\n' +
                "주문 가격 : " + price + '\n' +
                "메뉴 번호 : " + num;
    }
}