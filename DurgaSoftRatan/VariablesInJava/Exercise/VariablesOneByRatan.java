
import java.util.Scanner;

public class VariablesOneByRatan {

    static final double PI = Math.PI;
    double radius;

    double calculateArea() {

        return  PI * radius * radius;
    }

    void PrintArea() {
        double area=calculateArea();
        System.out.printf("The area of the circle with radius %.2f is %.3f%n", radius, area);
    }

    public static void main(String[] args) {
        VariablesOneByRatan obj = new VariablesOneByRatan();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Radius of the Circle");
        obj.radius = sc.nextDouble();
        obj.PrintArea();
    }
}
