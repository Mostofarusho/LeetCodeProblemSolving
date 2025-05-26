public class PangramString {
    public static void main(String[] args) {
        String givenString="The quick brown fox jumps over the lazy dog";
        String myString=givenString.toUpperCase().replaceAll("\\s", "");
        char[] ch=myString.toCharArray();
        int size=ch.length;
        int i=0;
        int a[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        while (i!=size) { 
            int index=ch[i]-65;
            a[index]=1;
            ++i;
        }
        i=0;
        while (i!=26) { 
            if(a[i]==1){
                ++i;
            }
            else{
                System.out.println("Non Pangram");
                System.exit(0);
            }

            
        }
        System.out.println("This String is a Pangram");
    }
}
