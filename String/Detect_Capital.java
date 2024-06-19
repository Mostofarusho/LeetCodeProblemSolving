package String;
public class Detect_Capital {
    public static void main(String[] args) {
        boolean input = detectCapitalUse("USA");
        System.out.println(input);

    }

    static boolean detectCapitalUse(String word) {
        char ch[]=word.toCharArray();
        int size=ch.length;
        
        
            if(ch[0]>='A' && ch[0]<='Z'){
                boolean allUpperCase=true;
                for(int i=1;i<size;i++){
                if(!(ch[i]>='A' && ch[i]<='Z')){
                    allUpperCase=false;
                    break;
                }
            }
              if(allUpperCase){
                return true;
              }
            }
           
           if(ch[0]>='A' && ch[0]<='Z'){
            for(int i=1;i<size;i++){
                if(!(ch[i]>='a' && ch[i]<='z')){
                    return false;
                }
            }
            return true;
           }
            
           for (char c : ch) {
            if (!(c >= 'a' && c <= 'z')) {
                return false;
            }
        }
        return true;
    }
}
