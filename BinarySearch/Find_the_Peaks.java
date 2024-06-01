import java.util.ArrayList;
import java.util.List;

public class Find_the_Peaks {
    public static void main(String[] args) {
        int[] myArray = { 1, 4, 3, 8, 5 };
        System.out.println(findPeaks(myArray));
    }

    static List<Integer> findPeaks(int[] myArray) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i < myArray.length-1; i++) {
            if (myArray[i] > myArray[i - 1] && myArray[i] > myArray[i + 1]) {
                list.add(i);
            }
        }
        return list;
    }
}