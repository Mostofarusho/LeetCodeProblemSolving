
public class Count_Hills_and_Valleys {

	public static void main(String[] args) {
		int[] myArray= {6,6,5,5,4,1};
		int ans=countHillValley(myArray);
		System.out.println(ans);
	}
	  static int countHillValley(int[] myArray) {
		  int count=0;
		  for(int i=1;i<myArray.length-1;i++) {
			  if(myArray[i]==myArray[i-1]) {
				  continue;
			  }
			  int left=i-1;
			  while(left>=0 && myArray[left]==myArray[i]) {
				  left--;
			  }
			  int right=i+1;
			  while(right<myArray.length && myArray[right]==myArray[i]) {
				  right++;
			  }
			  if(left>=0 && right<myArray.length) {
				  if(myArray[i]>myArray[left] && myArray[i]>myArray[right]) {
					  count++;
				  }
				  else if(myArray[i]<myArray[left] && myArray[i]<myArray[right]) {
					  count++;
				  }
			  }
		  }
		  return count;

}
}