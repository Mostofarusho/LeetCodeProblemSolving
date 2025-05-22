
public class conceptsInJava {

    static int num3=40;
    static int num4=60;

    public static void main(String[] args) {
        conceptsInJava obj1 = new conceptsInJava();
        // int add = obj.num1 + obj.num2;
        Demo obj2=new Demo();
        int add = obj2.num1 + obj2.num2;
        System.out.println(add);
        obj1.add();
        obj1.mul();
        conceptsInJava.into();
    }

    void add() {
        Demo obj2=new Demo();
        int addition =obj2.num1 + obj2.num2;
        System.out.println("There Value is " + addition);
    }

    void mul() {
        Demo obj2=new Demo();
        int multi = obj2.num1 * obj2.num2;
        System.out.println("The Multiplication Value is " + multi);
    }
    static void into(){
        int multi=conceptsInJava.num3*conceptsInJava.num4;
        System.out.println("Static Multi Is "+multi);
    }
}

