
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] myArray = new int[size];
        for (int i = 0; i < size; i++) {
            myArray[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(myArray[i]);
        }

        sc.close();
    }
    
}
