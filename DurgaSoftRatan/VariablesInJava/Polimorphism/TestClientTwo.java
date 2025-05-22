public class TestClientTwo extends Helper {
    @Override
    public void evening() {
        System.out.println("Hello Good Evening");
    }

    @Override
    public void night() {
        System.out.println("Hello,Good Night");
    }
    public static void main(String[] args) {
        TestClientTwo obj=new TestClientTwo();
        obj.morning();
        obj.evening();
        obj.night();
    }
}
