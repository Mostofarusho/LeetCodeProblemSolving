

public class Test {

    void m1(int... a) {
        for (int aa : a) {
            System.out.print(" "+aa+" ");
        }
        System.out.println();
    }

    void m1(boolean... b) {
        for (boolean bb : b) {
            System.out.print(" "+bb+" ");
        }
    }

    public static void main(String[] args) {
        Test obj = new Test();
        obj.m1(10, 20, 30,40);
        obj.m1(true,false,true,false);
        obj.m1();

    }
}
