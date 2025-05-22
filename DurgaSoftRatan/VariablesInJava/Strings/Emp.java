
public class Emp {

    int eid;
    String ename;

    Emp(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }
    public String toString(){
        return "Emp id= "+eid+" Emp ename= "+ename;
    }
    public static void main(String[] args) {
        Emp e1 = new Emp(11, "Rusho");
        System.out.println(e1);
        System.out.println(e1.toString());

    }

}
