public class Solution {
	public String intToRoman(int num) {
		String[] scale = { "I","IV","V","IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
		int[] scaleNum = { 1, 4, 5, 9, 10, 40, 50, 90 ,100, 400, 500, 900 ,1000 };
	
		return findScale(scale, scaleNum, num);
	}

	public String findScale(String[] scale, int[] scaleNum, int num){

		int quotient=0;
    	int remain=0;
    	int len=scale.length;
    	int division=0;
    	String total="";
    	int count=0;
		for(int i=len-1;i>=0;i--){
			division=scaleNum[i];
    		quotient=num/division;
    		remain=num%division;
    		if(quotient>=1){
    			while(quotient>0){
    				total=total+scale[i];
    				quotient--;
    			}
    			num=remain;
    			continue;
    		}else{
    			continue;
    		} 
    	}
		return total;
    }
}