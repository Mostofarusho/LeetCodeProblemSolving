public class nonDuplicate {
    public static void main(String[] args) {
        int[] myArray = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        System.out.println(singleNonDuplicate(myArray));
    }

    static int singleNonDuplicate(int[] myArray) {
        int start = 0;
        int end = myArray.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (mid % 2 == 1) {
                mid--; 
            }

            if (myArray[mid] != myArray[mid + 1]) {
                end = mid; 
            } else {
                start = mid + 2; 
            }
        }
        return myArray[start]; 
    }

}