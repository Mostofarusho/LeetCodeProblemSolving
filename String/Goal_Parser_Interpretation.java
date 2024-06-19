package String;
// You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

// Given the string command, return the Goal Parser's interpretation of command.

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Goal_Parser_Interpretation {
    public static void main(String[] args) {
       String ans=interpret("(al)G(al)()()G");
       System.out.println(ans);
	
    }
    static String interpret(String command) {
       // command = "G()()()()(al)";
       char ch[]=command.toCharArray();
       int size=ch.length;
       int i=0;
       String res="";
       while (i!=size) {
        if(ch[i]=='(' && ch[i+1]==')' && i<size){
            res=res+"o";
        }
        else if(ch[i]=='(' && ch[i+1]=='a' && ch[i+2]=='l' && ch[i+3]==')' && i<size){
            res=res+"al";
        }
        else if(ch[i]=='G'){
            res=res+"G";
        }
        ++i;
       }
       return res;
   
    }
}
