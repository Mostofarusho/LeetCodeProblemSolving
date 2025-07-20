import java.util.Scanner;
public class CodeWithHarryStringBasics {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String name="Mostofa";
    //    String nonTrim=name.startsWith('M');
       System.out.println(name.startsWith("M"));
       System.out.println(name.endsWith("x"));
       System.out.println(name.charAt(2));
       System.out.println(name.indexOf('s'));
       String modifiedname="MostofaMos";
       System.out.println(modifiedname.lastIndexOf("Mos"));

    }
}
