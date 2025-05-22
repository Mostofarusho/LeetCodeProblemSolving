
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOPackageTwo {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fis = new FileReader("xyz.txt");
        FileWriter fos = new FileWriter("rusho.txt");
        int c;
        while ((c = fis.read()) != -1) {
            System.out.print((char)c);
            fos.write(c);
        }
        fis.close();
        fos.close();
    }
}
