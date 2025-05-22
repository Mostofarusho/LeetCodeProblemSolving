public class bs {
    public static void main(String[] args) {
        int[] myArray={10,20,30,40,50,60};
        int target=40;
        System.out.println(search(myArray, target, 0, myArray.length-1));
    }
    static int search(int[] myArray,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(myArray[mid]==target){
            return mid;
        }
        if(target<myArray[mid]){
           return  search(myArray, target, start, mid-1);
        }
        return  search(myArray, target, mid+1, end);
    }
}
