
public class searchAnElement {

    public static void main(String[] args) {
        int[] myArray={2,4,6,8,10};
        int target=98;
        System.out.println(searchOn(myArray, 0, target));
    }

    static boolean searchOn(int[] myArray,int index, int target) {
        if(index==myArray.length){
            return false;
        }
        return myArray[index]==target || searchOn(myArray, index+1, target);
    }
}
