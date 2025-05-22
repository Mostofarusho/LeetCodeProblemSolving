public class TestClientOne implements Message {
    

    @Override
    public void morning() {
        System.out.println("Hello,Good Morning");
    }

    @Override
    public void evening() {
        System.out.println("Hello Good Evening");
    }

    @Override
    public void night() {
        System.out.println("Hello,Good Night");
    }
    public static void main(String[] args) {
        TestClientOne obj=new TestClientOne();
        obj.morning();
        obj.evening();
        obj.night();
    }
}
