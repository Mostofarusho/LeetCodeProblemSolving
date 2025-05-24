public class ConvertAStringWithSpacesFromLowercaseToUppercase {
    public static void main(String[] args) {
        String myString="rusho how are you";
        char[] ch=myString.toCharArray();
        int size=ch.length;
        int i=0;
        ch[0]=(char)(ch[0]-32);
        while (i!=size) { 
            if(ch[i]==' '){
                ch[i+1]=(char)(ch[i+1]-32);
            }
            ++i;
        }
        System.out.println(ch);
        System.out.println(myString);
    }
}
