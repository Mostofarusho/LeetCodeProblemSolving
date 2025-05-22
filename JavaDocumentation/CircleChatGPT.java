
public class CircleChatGPT extends ShapeChatGPT {

    double pi = Math.PI;

    void CircleArea() {
        double radius = length * length;
        double area = pi * radius;
        String formattedArea = String.format("Circle Area is %.3f", area);
        System.out.printf(formattedArea);
    }

}
