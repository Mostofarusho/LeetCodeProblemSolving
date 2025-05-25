public class StringContainsOnlyIntegers {
    public static void main(String[] args) {
        String myString="999A99";
        char[] ch=myString.toCharArray();
        int size=ch.length;
        int i=0;
        while (i!=size) { 
            if(ch[i]>=0 && ch[i]<='9'){
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
