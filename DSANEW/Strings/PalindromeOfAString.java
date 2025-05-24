public class PalindromeOfAString {
    public static void main(String[] args) {
        String givenString="Palindrome checker is running";
        String myString=givenString.replaceAll("\\s", "").toUpperCase();
        boolean ans=checkPalindrome(myString);
        // System.out.println(ans);
        if(ans){
            System.out.println("Yes This String is Palindrome");
        }
        else{
            System.out.println("No This String is not Palindrome");
        }
        
        
    }
    static boolean checkPalindrome(String myString){
        char[] ch=myString.toCharArray();
        int size=ch.length;
        char[] newArray=new char[size];
         int i=size-1;
        int j=0;
        while(i>=0){
            newArray[j]=ch[i];
            i--;
            j++;
        }
        int k=0;
        while (k!=size) { 
            if(newArray[k]!=ch[k]){
                    return false;
                }
                k++;
        }
        return true;
    }
}
