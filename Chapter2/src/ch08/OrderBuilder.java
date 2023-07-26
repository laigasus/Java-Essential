package ch08;

public class OrderBuilder {
    private long no;
    private int phone;
    private String address;
    private int date;
    private int time;
    private int price;
    private int num;

    public OrderBuilder no(long no) {
        this.no = no;
        return this;
    }

    public OrderBuilder phone(int phone) {
        this.phone = phone;
        return this;
    }

    public OrderBuilder address(String address) {
        this.address = address;
        return this;
    }

    public OrderBuilder date(int date) {
        this.date = date;
        return this;
    }

    public OrderBuilder time(int time) {
        this.time = time;
        return this;
    }

    public OrderBuilder price(int price) {
        this.price = price;
        return this;
    }

    public OrderBuilder num(int num) {
        this.num = num;
        return this;
    }

    public Order build() {
        return new Order(no, phone, address, date, time, price, num);
    }
}