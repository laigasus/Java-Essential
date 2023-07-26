package ch15;

public class Main {
    public static void main(String[] args) {
        Person edward = new Person("Edward", 20000);
        Taxi jalTaxi = new Taxi("잘 간다 운수택시");
        edward.takeTaxi(jalTaxi);

        edward.printInfo();
        jalTaxi.printInfo();
    }
}