
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationTest {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        Employee emp = new Employee(1111, "Rusho");

        // FileOutputStream fos = new FileOutputStream("abx.txt");
        // ObjectOutputStream oos = new ObjectOutputStream(fos);
        // oos.writeObject(emp);
        new ObjectOutputStream(new FileOutputStream("abx.txt")).writeObject(emp);
        System.out.println("Serialization Process is Completed");
    }
}
