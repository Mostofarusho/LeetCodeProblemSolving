
public class Demo {

    static int num1 = 10;
    static int num2 = 20;
    int num3 = 30;
    int num4 = 40;

    public static void main(String[] args) {
        Demo.add();
        Demo.multi();
        Demo d=new Demo();
        
    }

    static void add() {
        Demo d = new Demo();
        int add = d.num3 + d.num4;
        System.out.println("Addition is" + add);
        int addition = Demo.num1 + Demo.num2;
        System.out.println(addition);
    }

    static void multi() {
        Demo d = new Demo();
        int multi = d.num3 * d.num4;
        System.out.println("Multiplicatio is" + multi);
        int multiplication = Demo.num1 * Demo.num2;
        System.out.println(multiplication);
    }
}
