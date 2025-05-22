
public class CalculatorChatGPT {

    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        CalculatorChatGPT obj = new CalculatorChatGPT();

        double ans = obj.multiply(10.5, 80.6);
        String formattedString = String.format("Double Value is %.3f", ans);
        System.out.println(obj.multiply(10, 20));
        System.out.println(formattedString);
        
    }
}
