public class RemoveAllWhiteSpacesFromAString {
    public static void main(String[] args) {
        String myString="Join ABC Get Skilled    Get    placed    Or     Take Complete Refund";
        String newString=myString.replaceAll("\\s", "");
        System.out.println(newString);
    }
}
 