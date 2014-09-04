public class Solution {
	public String addBinary(String a, String b) {
		int alen = a.length();
		int blen = b.length();
		int min =Math.min(alen, blen);
		int count=0;
		int carry = 0;
		String res = "";
		char cha,chb;
		int i = alen - 1,j = blen - 1;

		for(count=0; count<min; i--,j--,count++ ){
			cha = a.charAt(i);
			chb = b.charAt(j);
			int val=toInt(cha) + toInt(chb) + carry;
			if (val > 1) {
				val=val-2;
				res=toString(val)+res;
				carry = 1;
			}
			else{
				res=toString(val)+res;
				carry=0;
			}
		}
		while(i>=0){
			cha = a.charAt(i);
			int val=toInt(cha) + carry;
			if (val > 1) {
				val=val-2;
				res=toString(val)+res;
				carry = 1;
			}
			else{
				res=toString(val)+res;
				carry=0;
			}
			i--;
		}
		while(j>=0){
			chb = b.charAt(j);
			int val=toInt(chb) + carry;
			if (val > 1) {
				val=val-2;
				res=toString(val)+res;
				carry = 1;
			}
			else{
				res=toString(val)+res;
				carry=0;
			}
			j--;
		}		
		if(carry==1)res="1"+res;
		return res;
	}

	public int toInt(char ch) {
		if (ch == '0')
			return 0;
		if (ch == '1')
			return 1;
		else {
			return -1;
		}
	}

	public String toString(int val){
    	return Integer.toString(val);
    }
}