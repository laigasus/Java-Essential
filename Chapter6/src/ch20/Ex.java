package ch20;

public class Ex extends Thread {
    @Override
    public void run() {
        System.out.println("출력");
    }

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread t = new Ex();
            t.start();

            Thread.sleep(i * 1000);
        }
    }
}