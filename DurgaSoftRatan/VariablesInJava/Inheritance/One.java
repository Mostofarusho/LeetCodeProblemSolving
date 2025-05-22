
public class One {

    int a;
    static int b=10;

    One() {
      System.out.println("Parent Class Constructor Instance  Value of a is "+a);
      System.out.println("Parent Class Constructor Static Value of b is "+One.b);
    }

    {
        a = 100;
        System.out.println("This is My Parent Class Instance Block " + a);
    }
    static {
        System.out.println("This is My Parent Class Static Block " + One.b);
    }

}
