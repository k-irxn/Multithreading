package basic;

public class SequentialExecution {

    public static void demo1() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Demo 1 " + i);
        }
    }

    public static void demo2() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Demo 2 " + i);
        }
    }

    public static void main(String[] args) {
        demo1();
        demo2();
    }
}
