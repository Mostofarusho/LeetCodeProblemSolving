
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOPackageThree {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        BufferedInputStream br = new BufferedInputStream(new FileInputStream("mostofa.txt"));
        BufferedOutputStream bw = new BufferedOutputStream(new FileOutputStream("fattha.txt"));
        int c;

        while ((c = br.read()) != -1) {
            System.out.print((char)c);
            bw.write(c);
            // bw.newLine();
        }
        br.close();
        bw.close();

    }
}
