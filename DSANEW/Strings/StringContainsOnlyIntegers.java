public class StringContainsOnlyIntegers {
    public static void main(String[] args) {
        String myString="99999";
        int size=myString.length();
        int i=0;
        while (i!=size) { 
            if(myString.charAt(i)>=0 && myString.charAt(i)<='9'){
                i++;
            }
            else{
                System.out.println("The String is not an integer");
                System.exit(0);
            }
            
        }
        System.out.println("Integer String");
    }
}
