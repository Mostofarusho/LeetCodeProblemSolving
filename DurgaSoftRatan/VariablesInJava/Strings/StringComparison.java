
public class StringComparison {

    StringComparison(String str) {
        
    }

    public static void main(String[] args) {
        StringComparison sc1 = new StringComparison("Mostofa");
        StringComparison sc2 = new StringComparison("Mostofa");
        System.out.println(sc1.equals(sc2));

        String s1 = "Omar";
        String s2 = "Omar";
        System.out.println(s1.equals(s2));

        StringBuffer sb1 = new StringBuffer("Fattha");
        StringBuffer sb2 = new StringBuffer("Fattha");
        System.out.println(sb1.equals(sb2));
    }
}
