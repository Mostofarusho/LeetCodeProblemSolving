import java.util.Arrays;

public class SortingAlgorithms {

	public static void main(String[] args) {
		int[] myarray = {2,0,2,1,1,0};
	
		BubbleSort(myarray);
		System.out.println(Arrays.toString(myarray));

	}
    
    static void BubbleSort(int[] myarray) {
    	boolean swapped=false;
    	for(int i=0;i<myarray.length;i++) {
    		for(int j=1;j<myarray.length-i;j++) {
    			if(myarray[j]<myarray[j-1]) {
    				swap(myarray,j,j-1);
    				swapped=true;
    			}
    		}
    		if(!swapped) {
        		break;
        	}
    	}
    	
    }
    static void selection(int[] myarray) {
    	for(int i=0;i<myarray.length;i++) {
    		int last=myarray.length-i-1;
    		int maxIndex=maxIndex(myarray,0,last);
    		swap(myarray,maxIndex,last);
    	}
    }
    static void insertion(int[] myarray) {
    	for(int i=0;i<myarray.length-1;i++) {
    		for(int j=i+1;j>0;j--) {
    			if(myarray[j]<myarray[j-1]) {
    				swap(myarray, j, j-1);
    			}
    			else {
    				break;
    			}
    		}
    	}
    }
    static void cyclicSort(int[] myarray) {
   	 int i=0;
   	 while(i<myarray.length)
   	 {
   		 int correct=myarray[i]-1;
   		 if(myarray[i]!=myarray[correct]) {
   			 swap(myarray,i,correct);
   		 }
   		 else {
   			 i++;
   		 }
   	 }
   	 }
    static int maxIndex(int[] myarray,int start,int end) {
    	int max=start;
    	for(int i=0;i<=end;i++) {
    		if(myarray[max]<myarray[i]) {
    			max=i;
    		}
    	}
    	return max;
    }
    static void swap(int[] myarray,int first,int second) {
		int temp=myarray[first];
		myarray[first]=myarray[second];
		myarray[second]=temp;
	}
}
