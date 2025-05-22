
public class numberOfZeros {

    public static void main(String[] args) {
        System.out.println(zeroes(20002000));
        System.out.println(count(20002000));
    }

    static int zeroes(int n) {
        int count = 0;
        while (n != 0) {
            int rem = n % 10;
            if (rem == 0) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }

    static int count(int n) {
        return helper(n, 0);
    }

    static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, count+1);
        }

        return helper(n / 10, count);

    }
}
