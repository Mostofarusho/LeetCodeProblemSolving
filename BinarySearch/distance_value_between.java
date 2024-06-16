public class distance_value_between {
    public static void main(String[] args) {
        int[] arr1 = { 4, 5, 8 };
        int[] arr2 = { 10, 9, 1, 8 };
        int d = 2;
        int ans = findTheDistanceValue(arr1, arr2, d);
        System.out.println(ans);
    }

    static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int start = 0;
        int end = arr1.length - 1;
        int count = 0;
        
        while (start <= end) {
            boolean isValid = true;
            for (int i = 0; i <= arr2.length - 1; i++) {
                if (Math.abs(arr1[start] - arr2[i]) <= d) {
                    isValid = false;
                    break;
                }

            }
            if (isValid) {
                count++;
            }

            start++;
        }
        return count;
    }
}
