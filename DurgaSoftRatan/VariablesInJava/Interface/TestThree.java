public class TestThree extends TestTwo{
    public void m3() {
        System.out.println("This is my m3 method");
    }
    public static void main(String[] args) {
        TestThree obj=new TestThree();
        obj.m1();
        obj.m2();
        obj.m3();

        it1 i=new TestThree();
        i.m1();
        i.m2();
        i.m3();
    }
}
