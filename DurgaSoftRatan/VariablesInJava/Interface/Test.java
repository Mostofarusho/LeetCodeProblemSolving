public class Test implements Cloneable {

    int a = 10;
    int b = 20;

    public static void main(String[] args) throws CloneNotSupportedException {
        Test obj = new Test();
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.a = 999;
        obj.b = 888;
        System.out.println(obj.a);
        System.out.println(obj.b);

        Test t1 = (Test) obj.clone();
        obj.a = 777;
        obj.b = 666;
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(t1.a);
        System.out.println(t1.b);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
