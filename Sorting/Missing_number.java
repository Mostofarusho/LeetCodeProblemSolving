import java.util.Arrays;

public class Missing_number {

	public static void main(String[] args) {
		int[] myarray = { 3, 0, 1 };

		int ans = cyclicSort(myarray);
		System.out.println(ans);

	}

	static int cyclicSort(int[] myarray) {
		int i = 0;
		int n = myarray.length;
		while (i < n) {
			int correct = myarray[i];
			if (correct < n && myarray[i] != myarray[correct]) {
				swap(myarray, i, correct);
			} else {
				i++;
			}
		}
		for (int j = 0; j < myarray.length; j++) {
			if (j != myarray[j]) {
				return j;
			}
		}
		return myarray.length;
	}

	static void swap(int[] myarray, int first, int second) {
		int temp = myarray[first];
		myarray[first] = myarray[second];
		myarray[second] = temp;
	}

}
