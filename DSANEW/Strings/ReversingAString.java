public class ReversingAString {
    public static void main(String[] args) {
        String myString="ABC TECH";
        char ch[]=myString.toCharArray();
        int size=ch.length;
        char newArray[]=new char[size];
        int i=size-1;
        int j=0;
        while(i>=0){
            newArray[j]=ch[i];
            i--;
            j++;
        }
        String newOne=new String(newArray);
        System.out.println(newOne);
    }
}
