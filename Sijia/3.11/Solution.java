public class Solution {
	public int romanToInt(String s) {
		int num = 0;
		int[] scaleNum = { 1, 5, 10, 50, 100, 500, 1000 };
		int len = s.length();
		for (int i = 1; i < len ; i++) {
			if (getIndexOfChar(s.charAt(i-1)) < getIndexOfChar(s.charAt(i)))
				num = num - scaleNum[getIndexOfChar(s.charAt(i-1))];
			else{
				num+=scaleNum[getIndexOfChar(s.charAt(i-1))];
			}
		}
		num+=scaleNum[getIndexOfChar(s.charAt(len-1))];
		return num;
	}

	public int getIndexOfChar(char ch) {
		char[] scale = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		int scaleLen = scale.length;
		for (int i = 0; i < scaleLen; i++) {
			if (scale[i] == ch || scale[i] == ch-32)
				return i;
		}
		return -1;
	}
}
