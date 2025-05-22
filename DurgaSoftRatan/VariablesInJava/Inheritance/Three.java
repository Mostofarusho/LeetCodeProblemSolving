public class Three extends Two{
    void m5() {
        System.out.println("Two Class M5 method");
    }

    void m6() {
        System.out.println("Two Class M6 method");
    }
    public static void main(String[] args) {
        Three obj=new Three();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.m4();
        obj.m5();
        obj.m6();
    }
}
