
public class Then extends Now implements Now.it1 {

    @Override
    public void m1() {
        System.out.println("This is m1 method");
    }
    public static void main(String[] args){
        Then obj=new Then();
        obj.m1();
    }
}
