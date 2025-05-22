
public class constructorsTwo {

    int eid;
    String ename;
    double esal;
    static String company="Talha Soft";
    static String address="Dhanmondi";

    constructorsTwo(int eid, String ename, double esal) {
        this.eid = eid;
        this.ename = ename;
        this.esal = esal;
        
    }

    
        void status(){
        if (esal > 1000) {
            System.out.println("Very Good Employee "+constructorsTwo.company+" "+constructorsTwo.address);
        } else {
            System.out.println("Average Employee "+constructorsTwo.company+" "+constructorsTwo.address);
        }
    }

    public static void main(String[] args) {
        constructorsTwo obj1 = new constructorsTwo(11, "Mostofa", 250000 );
        constructorsTwo obj2 = new constructorsTwo(11, "Mostofa", 250 );
        obj1.status();
        obj2.status();
    }
}
