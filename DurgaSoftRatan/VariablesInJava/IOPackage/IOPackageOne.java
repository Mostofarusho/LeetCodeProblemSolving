
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOPackageOne {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // System.out.println("Hello");
        FileInputStream fis = new FileInputStream("abc.txt");
        FileOutputStream fos = new FileOutputStream("xyz.txt");
        int c;
        while((c=fis.read())!=-1){
            System.out.print((char)c);
            fos.write(c);
        }
        fis.close();
        fos.close();
    }
}
