
public class ParentPoly {

    public static void main(String[] args) {
        System.out.println("Parent Main");
        main(10);
    }
    public static void main(int a) {
        System.out.println("int Main method");
        main('r');
    }
    public static void main(char ch) {
        System.out.println("char Main method");
    }
}
