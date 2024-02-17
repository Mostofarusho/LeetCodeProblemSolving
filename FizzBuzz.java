import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        List<String> numbers = fizzBuzz(15);
        System.out.println(numbers);
    }

    static List<String> fizzBuzz(int n) {
        List<String> addString = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                addString.add("FizzBuzz");
            }
           else if (i % 3 == 0) {
                addString.add("Fizz");

            } else if (i % 5 == 0) {
                addString.add("Buzz");
            } else {
                addString.add(Integer.toString(i));
            }
        }
        return addString;
    }

}