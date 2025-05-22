
public class ConstructorOneByRatan {

    ConstructorOneByRatan() {
        this(10);
        System.out.println("0---args Constructor");
    }

    ConstructorOneByRatan(int a) {
        this(10,20);
        System.out.println("1----args Constructor " + a);
    }

    ConstructorOneByRatan(int a, int b) {
        System.out.println("2----args Consturctor " + a + "  " + b);
    }

    public static void main(String[] args) {
        // ConstructorOneByRatan obj = new ConstructorOneByRatan();
        new ConstructorOneByRatan();
       

    }
}
