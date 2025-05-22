public class LengthOfAString {
    public static void main(String[] args) {
        String myString="ABC TECH";
        myString=myString.concat("\0");
        char ch[]=myString.toCharArray();
        int count=0;
        int i=0;
        while(ch[i]!='\0'){
            ++count;
            ++i;
        }
        System.out.println("%d"+count);
    }
}
