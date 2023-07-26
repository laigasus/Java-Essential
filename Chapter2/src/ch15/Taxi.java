package ch15;

public class Taxi {
    String company;
    int money;
    // 모든 택시 회사의 비용 고정
    final static int cost = 10000;

    Taxi(String company) {
        this.company = company;
    }

    void take(int money) {
        this.money += money;
    }

    void printInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(company);
        sb.append(" 수입은 ");
        sb.append(money);
        sb.append(" 입니다");
        System.out.println(sb);
    }
}