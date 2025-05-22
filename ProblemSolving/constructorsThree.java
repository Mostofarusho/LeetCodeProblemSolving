
public class constructorsThree {

    int a;
    int b;

    constructorsThree(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void add() {
        System.out.println("Addition is " + a + b);
    }

    void multi() {
        System.out.println("Multiplication is " + a * b);
    }

    void division() {
        System.out.println("Division is " + a / b);
    }

    public static void main(String[] args) {
        constructorsThree obj = new constructorsThree(200,100);
        obj.add();
        obj.multi();
        obj.division();
    }
}
