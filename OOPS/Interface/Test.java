
public class Test implements Cloneable{

    int a = 10, b = 20;

    public static void main(String[] args) throws CloneNotSupportedException {
        Test obj = new Test();
        System.out.println(obj.a + "  " + obj.b);

        Test copy = (Test) obj.clone();
        System.out.println(copy.a + "  " + copy.b);
    }
}
