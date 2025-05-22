
public class StringCompare {

    public static void main(String[] args) {
        String s1 = "ratan";
        String s2 = "anu";
        String s3 = "ratan";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s2));

        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s2.compareTo(s3));

        System.out.println("RATAN".equals("ratan"));
        System.out.println("RATAN".equalsIgnoreCase("ratan"));

        System.out.println("RATAN".compareTo("ratan"));
        System.out.println("RATAN".compareToIgnoreCase("ratan"));
    }
}
