public class PreciseFormat{
    public static void main(String[] args) {
        PreciseFormat.printInFormat(5.43,2.653); 
    }
    static void printInFormat(float a, float b){
        float result = a/b;
        System.out.println(result);
        System.out.printf("%.3f%n", result);
        
        // Your code here to print upto 3 decimal places
        
    } 
}