package basic;

public class ThreadedExecution {

    public static class demo1 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }

    public static class demo2 implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        }
    }

    public static void main(String[] args) {
        Thread one = new Thread(new demo1());
        Thread two = new Thread(new demo2());
        one.start();
        two.start();
    }
}
