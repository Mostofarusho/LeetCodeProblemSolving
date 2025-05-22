
public class areaOfMaxDiagonal {

    public static void main(String[] args) {
        int[][] dimensions = {{9, 3}, {8, 6}};
        int answer = areaOfMaxDiagonal(dimensions);
        System.out.println(answer);

    }

    static int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = 0.0;
        int maxArea = 0;
        for(int[] rect:dimensions){
            int length=rect[0];
            int width=rect[1];

            double diagonal=Math.sqrt(length*length+width*width);
            int area=length*width;
            if(diagonal>maxDiagonal){
                maxDiagonal=diagonal;
                maxArea=area;
            }
            else if(maxDiagonal==diagonal){
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        return maxArea;

    }
}
