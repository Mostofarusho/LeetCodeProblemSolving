public class FloorOfANumber {

    public static void main(String[] args) {
        int[] myArray = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 1;
        int ans = Celling(myArray, target);
        System.out.println("This is My" + ans);
    }

    static int Celling(int[] myArray, int target) {
        if(target>myArray[myArray.length-1] || target<myArray[0]){
            return -1;
        }
        int start = 0;
        int end = myArray.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > myArray[mid]) {
                start = mid + 1;
            } else if (target < myArray[mid]) {
                end = mid - 1;
            } else if (target == myArray[mid]) {
                return myArray[mid];
            }
           
        }

      
        return myArray[end];
    }
}