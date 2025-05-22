
import java.io.Serializable;

public class Employee implements Serializable {

    int eid;
    transient String ename;

    Employee(int eid, String ename) {
        this.eid = eid;
        this.ename = ename;
    }
}
