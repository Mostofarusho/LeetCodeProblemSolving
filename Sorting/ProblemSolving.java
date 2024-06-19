
public class ProblemSolving {

	 public static void main(String[] args) {
	        int[] myarray={1,2,2,1};
	        int k=1;
	        int ans=countKDifference(myarray,k);
	        System.out.println(ans);
	    }
	    static int countKDifference(int[] myarray,int k){
	        int count=0;
	        for(int i=0;i<myarray.length;i++){
	            for(int j=i+1;j<myarray.length;j++){
	                if(Math.abs(myarray[i]-myarray[j])==k){
	                    count++;
	                   // break;
	                }
	            }
	        }
	        return count;
	    }

}
