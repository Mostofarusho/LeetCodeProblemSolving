
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch=sc.next().trim().charAt(0);
        System.out.println(ch);

        if(ch>='A' && ch<='Z'){
            System.out.println("Upper Case");
        }
        else{
            System.out.println("Lower case");
        }

        // System.out.println("Enter Number A");
        // int a = sc.nextInt();//10
        // System.out.println("Enter Number B");
        // int b = sc.nextInt();//11
        // System.out.println("Enter Number C");
        // int c = sc.nextInt();//12

        // System.out.println("The biggest Number of Three is"+isBiggest(a, b, c));
        
}
// static int isBiggest(int a,int b,int c){
//     if(a>b){
//         if(a>c){
//             return a;
//         }
//         return c;
//     }
//     else if(b>a){
//         if(b>c){
//             return b;
//         }
//         return c;
//     }
//     return -1;
// }
}
