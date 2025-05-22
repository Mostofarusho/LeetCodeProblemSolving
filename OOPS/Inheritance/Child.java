
public class Child extends Parent {

    Child() {
        System.out.println("Child Class 0-args Constructor");
    }

    static {
        System.out.println("Child Class Static Block");
    }

    {
        System.out.println("Child Class Instance Block");
    }
    public static void main(String[] args) {
        new Child();

    }
}
