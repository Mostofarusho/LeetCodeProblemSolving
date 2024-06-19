import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Disappeared_Numbers {

	public static void main(String[] args) {
		int[] myarray = { 1,2};
		List<Integer> ans = findDisappearedNumbers(myarray);
		System.out.println(ans);

	}

	static List<Integer> findDisappearedNumbers(int[] myarray) {
		ArrayList<Integer> missingNumber = new ArrayList();
		boolean found=false;
		int i = 0;
		int n = myarray.length;
		while (i < n) {
			int correct = myarray[i]-1;
			if (correct < n && myarray[i] != myarray[correct]) {
				swap(myarray, i, correct);
			} else {
				i++;
			}
		}
		for (int j = 0; j < n; j++) {
            if (myarray[j] != j + 1) {
                missingNumber.add(j + 1);
            }
        }

			
				
		
//		if(found==true) {
//			return missingNumber;
//		}
//		else {
//			missingNumber.add(myarray.length);
//			return missingNumber;
//		}
		return missingNumber;
			 
	}

	static void swap(int[] myarray, int first, int second) {
		int temp = myarray[first];
		myarray[first] = myarray[second];
		myarray[second] = temp;
	}

}
