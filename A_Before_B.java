public class A_Before_B {
    public static void main(String[] args) {
        boolean ans = checkStringAB("bbb");
        System.out.println(ans);
    }
    
    static boolean checkStringAB(String s) {
        char[] ch = s.toCharArray();
        boolean foundA = false;
        int size=ch.length;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(ch[i]=='b' && ch[j]=='a'){
                    return foundA;
                }
            }
        }
     
        return !foundA;
    }
}
