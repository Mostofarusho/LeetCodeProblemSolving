
import java.util.Arrays;

public class functionsKKThree {

    public static void main(String[] args) {
        fun("Mostofa", "Omar", "Fattha", "Rusho");
        multiple(1, 2, 10, 20, 30);
    }

    static void multiple(int a, int b, int... v) {
        System.out.println("a: " + a + ", b: " + b + ", v: " + Arrays.toString(v));
    }

    static void fun(String... var) {
        System.out.println(Arrays.toString(var));
    }
}
