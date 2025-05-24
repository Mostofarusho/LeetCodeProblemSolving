public class CopyingOneStringIntoAnother {
    public static void main(String[] args) {
        String myString="ABC TECH";
        char ch[]=myString.toCharArray();
        int size=ch.length;
        char newArray[]=new char[size];
        int i=0;
        while (i!=size) { 
            newArray[i]=ch[i];
            i++;
        }
        String newOne=new String(newArray);
        System.out.println(newOne);
    }
}
