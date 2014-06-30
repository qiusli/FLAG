public class Solution {
    public void nextPermutation(int[] num) {
        if(num.length>=2){
    	    int parIndex=findPartitionNumIndex(num);
    	    if(parIndex!=-1){
    	        int changeIndex=findChangedNumIndex(num, parIndex);
    	        swap(num,parIndex,changeIndex);
    	    }
    	    reverse(num,parIndex+1,num.length-1);    
        }
    }
    public int findPartitionNumIndex(int[] num){
    	for(int i=num.length-1; i>0; i--){
    		if(num[i-1]<num[i]) return i-1;
    	}
    	return -1;
    }
    
    public int findChangedNumIndex(int[] num, int parIndex){
    	for(int i=num.length-1; i> parIndex; i--){
    		if(num[i]>num[parIndex]) return i;
    	}
    	return -1;
    }
    
    public void reverse(int[] num, int start, int end){
    	for(int i=start, j=end ; i <= (end+start)/2; i++, j-- ){
    		int temp=num[i];
    		num[i]=num[j];
    		num[j]=temp;
    	}
    }
    public void swap(int[] num, int index1, int index2 ){
    	int temp=num[index1];
    	num[index1]=num[index2];
    	num[index2]=temp;
    }
}