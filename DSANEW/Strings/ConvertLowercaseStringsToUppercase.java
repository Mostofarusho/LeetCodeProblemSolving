public class ConvertLowercaseStringsToUppercase {
    public static void main(String[] args) {
        String myString="RUSHO";
        char ch[]=myString.toCharArray();
        int size=ch.length;
        int i=0;
        while (i!=size) { 
            ch[i] = (char)(ch[i] + 32);
            ++i;
        }
        System.out.println(ch);
        System.out.println(myString);
        
    }
}
