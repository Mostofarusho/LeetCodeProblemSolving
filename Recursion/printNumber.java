
public class printNumber {

    public static void main(String[] args) {
        int[] myArray = {2, 4, 6, 8, 10, 12};
        int target = 8;
        int ans=search(myArray, target, 0, myArray.length-1);
        System.out.println(ans);

    }

    static int search(int[] myArray, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid=start+(end-start)/2;
        if(target==myArray[mid]){
            return mid;
        }
        if(target<myArray[mid])
            {
              return   search(myArray, target, 0, mid-1);
            }

            else{
               return  search(myArray, target, mid+1, end);
            }

    }

}
