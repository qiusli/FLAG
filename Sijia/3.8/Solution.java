public class Solution {
	public String longestCommonPrefix(String[] strs) {
	    if(strs==null) return null;
	    if(strs.length==0) return "";
		if(strs.length==1) return strs[0]; 
        int N=strs.length;
        int min=Integer.MAX_VALUE;
        int total=0;
    	for(int i=0;i<N-1; i++){
    		total=longestPrefix(strs[i],strs[i+1]);
    		if(total<min) min=total;
    	}
    	return strs[0].substring(0,min);
    }

	public int longestPrefix(String str1, String str2) {
		if (str1 == null || str2 == null)
			return 0;
		int total = 0;
		int i = 0, j = 0;
		int s1len = str1.length();
		int s2len = str2.length();
		int count = Math.min(s1len, s2len);
		while (count > 0) {
			if (str1.charAt(i) == str2.charAt(j)) {
				total += 1;
				i++;j++;
			} else {
				return total;
			}
			count--;
		}
		return total;
	}
}