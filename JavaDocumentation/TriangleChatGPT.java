public class TriangleChatGPT extends ShapeChatGPT{
    void TriangleArea(){
        double area=.5*length*width;
        String formattedArea = String.format("Triangle Area is %.3f", area);
        System.out.printf(formattedArea);
       
    }
}
