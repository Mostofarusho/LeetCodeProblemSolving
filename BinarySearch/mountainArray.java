public class mountainArray {
    public static void main(String[] args) {
        int[] myArray = { 0, 1, 3, 5, 7, 6, 3, 2 };
        System.out.println(peakIndexInMountainArray(myArray));
    }
    static int peakIndexInMountainArray(int[] myArray) {
		int start=0;
		int end=myArray.length-1;
		while(start<end) {
			int mid=start+(end-start)/2;
			
			if(myArray[mid]>myArray[mid+1]) {
				end=mid;
			}
			else {
				start=mid+1;
			}	
		
		}
				return end;
	}

}

