
public class StaticBlockOneByRatan {

    static int eid;
    // static void disp(int a){
    //     StaticBlockOneByRatan.eid=a;
    //     System.out.println("My First Static Block "+a);
    // }
    static {
        eid=11;
    }
    static void disp(){
        System.out.println("My First Static Block "+eid);
    }
    

    public static void main(String[] args) throws ClassNotFoundException {
        StaticBlockOneByRatan.disp();
     
    }
}
