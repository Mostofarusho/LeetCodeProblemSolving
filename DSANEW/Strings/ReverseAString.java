public class ReverseAString {
    public static void main(String[] args) {
        String x="ABC Tech";
        char[] ch=x.toCharArray();
        int size=ch.length;
        char[] myArray=new char[size];
        int i=0;
        while (i<ch.length) { 
            myArray[i]=ch[i];
            i++;
            size--;
        }
        String result=new String(myArray);
        System.out.println(result);
    }
}
