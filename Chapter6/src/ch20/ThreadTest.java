package ch20;

class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            System.out.print(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.print("\033[H\033[2J");
        }
    }

}

public class ThreadTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread() + "start");

        MyThread runnable = new MyThread();

        Thread th1 = new Thread(runnable);

        th1.start();
    }
}
