
public class constructorsOne {

    void wish() {
        System.out.println("Good Morning...");
    }

    constructorsOne() {
        this(10);

        System.out.println("This is constructor without parameter");

    }

    constructorsOne(int a) {
        this(10, 90);
        System.out.println("This is a single Paramenter Constructor " + a);
    }

    constructorsOne(int a, int b) {
        this("Mostofa");
        int result = a + b;
        System.out.println("This is a Two Paramenter Constructor " + result);
    }

    constructorsOne(String name) {
        System.out.println("This is a string Paramenter Constructor " + name);
    }

    public static void main(String[] args) {
        new constructorsOne();

    }
}
