
public class ThreadDemo {

    public static void main(String[] args) {
        MyThread t = new MyThread();
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(t);

        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }

    }
}
