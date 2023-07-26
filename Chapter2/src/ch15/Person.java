package ch15;

public class Person {
    String name;
    int money;

    Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    void takeTaxi(Taxi taxi) {
        this.money -= Taxi.cost;
        taxi.take(Taxi.cost);
    }

    void printInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append("님의 남은 돈은 ");
        sb.append(money);
        sb.append(" 입니다");
        System.out.println(sb);
    }
}
