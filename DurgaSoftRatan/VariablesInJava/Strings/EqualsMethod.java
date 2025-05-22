
public class EqualsMethod {

    EqualsMethod(String str) {

    }

    public static void main(String[] args) {
        EqualsMethod eq1 = new EqualsMethod("Mostofa");
        EqualsMethod eq2 = new EqualsMethod("Mostofa");
        System.out.println(eq1.equals(eq2));

        String st1 = "Omar";
        String st2 = "Omar";
        System.out.println(st1.equals(st2));

        StringBuffer sb1 = new StringBuffer("Fattha");
        StringBuffer sb2 = new StringBuffer("Fattha");
        System.out.println(sb1.equals(sb2));
    }
}
