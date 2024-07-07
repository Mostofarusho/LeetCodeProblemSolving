public class FaultyKeyboard {
    public static void main(String[] args) {
        String s1 = "string";
        String ans1=finalString(s1);
        System.out.println(ans1);
        String s2 = "poiinter";
        String ans2=finalString(s2);
        System.out.println(ans2);
    }
    public static String finalString(String s) {
        StringBuilder res=new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='i'){
               
                res.reverse();
            }
            else{
                res.append(s.charAt(i));
            }
            
            
        }
        return res.toString();
    }
    
}
// public class FaultyKeyboard {
//     public static void main(String[] args) {
//         String s = "string";
//         String ans = finalString(s);
//         System.out.println(ans); // Expected output: "rtsng"
//     }

//     public static String finalString(String s) {
//         char myArray[] = s.toCharArray();
//         String res = "";

//         for (int i = 0; i < myArray.length; i++) {
//             if (myArray[i] == 'i') {
//                 // Manually reverse the current result string
//                 res = reverseString(res);
//             } else {
//                 res = res + myArray[i];
//             }
//         }
        
//         return res;
//     }

//     public static String reverseString(String str) {
//         String reversed = "";
//         for (int i = str.length() - 1; i >= 0; i--) {
//             reversed = reversed + str.charAt(i);
//         }
//         return reversed;
//     }
// }

