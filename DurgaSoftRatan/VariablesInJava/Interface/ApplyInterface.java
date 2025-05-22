
public class ApplyInterface implements interfaceThree {

    public void m1() {
        System.out.println("M1 method");
    }

    public void m2() {
        System.out.println("M2 method");
    }

    public void m3() {
        System.out.println("M3 method");
    }
    public static void main(String[] args) {
        ApplyInterface obj=new ApplyInterface();
        obj.m1();
        obj.m2();
        obj.m3();

        interfaceThree it3=new ApplyInterface();
        it3.m1();
        it3.m2();
        it3.m3();
    }
}
