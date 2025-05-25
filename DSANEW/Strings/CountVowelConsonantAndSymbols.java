public class CountVowelConsonantAndSymbols {
    public static void main(String[] args) {
        String givenString="ARADHYA'S BRILLIANCE CENTER";
        String myString=givenString.toUpperCase();
        char[] ch=myString.toCharArray();
        int size=ch.length;
        int vCount=0;
        int cCount=0;
        int sCount=0;
        int i=0;
        while (i!=size) { 
            if(ch[i]>='A' && ch[i]<='Z'){
                if(ch[i]=='A' || ch[i]=='E'|| ch[i]=='I'|| ch[i]=='O'|| ch[i]=='U'){
                    vCount++;
                }
                else{
                    cCount++;
                }
            }
            else{
                sCount++;
            }
            i++;
        }
        System.out.println("Number of Vowels is "+vCount);
        System.out.println("Number of Consonants is "+cCount);
        System.out.println("Number of Special Characters is "+sCount);
    }
}
