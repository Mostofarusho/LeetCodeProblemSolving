
public class PolyFour extends PolyThree {

    PolyFour() {
        super();
        System.out.println("Abstrct Class Poly Four Constructor ");
    }
    {
        System.out.println("Child class Instance Block");
    }
    static {
        System.out.println("Child Class Static Block");
    }
    void m3() {
        System.out.println("This is mY M-3 Method");
    }

    public static void main(String[] args) {
        PolyFour obj = new PolyFour(); 
        obj.m3();
        obj.m2();
        // obj.m1();
        // obj.m2();
        // obj.m3();
        // obj.m4();
    }
}
