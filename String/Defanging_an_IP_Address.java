package String;
public class Defanging_an_IP_Address{
    public static void main(String[] args) {
        String ans=defangIPaddr("1.1.1.1");
        System.out.println(ans);
    }
// Input: address = "1.1.1.1"
// Output: "1[.]1[.]1[.]1"
    static String defangIPaddr(String address){
        char ch[]=address.toCharArray();
        int size=ch.length;
        int i=0;
        StringBuilder res = new StringBuilder();
       
        while(i!=size){
            if(ch[i]=='.' && i<size-1){
               res.append("[.]");
            }
            else{
                res.append(ch[i]);
            }
            i++;
        }
        return res.toString();
    }
}
