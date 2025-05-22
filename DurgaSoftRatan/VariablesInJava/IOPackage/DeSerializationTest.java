
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeSerializationTest {
    public static void main(String[] args) throws Exception{
        // FileInputStream fis=;
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abx.txt"));
        Employee e=(Employee)ois.readObject();
        System.out.println(e.eid+"-----"+e.ename);
    }
}
