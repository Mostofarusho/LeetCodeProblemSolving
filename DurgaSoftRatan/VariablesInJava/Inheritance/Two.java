
public class Two extends One {

    int a;
    static int b=10;

    Two() {
        System.out.println("Child Class Constructor Value of a is "+a);
        System.out.println("Parent Class Constructor Static Value of b is "+Two.b);
      }

    {
        a=200;
        System.out.println("This is My Child Class Instance Block " + a);
    }
    static {
        System.out.println("This is My Child Class Static Block " + Two.b);
    }

    public static void main(String[] args) {
        new Two();
        new Two();

    }

}
