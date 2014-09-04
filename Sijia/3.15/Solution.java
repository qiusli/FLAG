public class Solution {
	public int lengthOfLastWord(String s) {
		int len = getString(s,s.length()-1).length();
		if (len == 0)
			return 0;
		else if (len == 1) {
			return 1;
		} else {
			int i = len - 1;
			int count = 0;
			while (i >= 0 && s.charAt(i) != ' ') {
				count++;
				i--;
			}
			return count;
		}

	}

	public String getString(String s, int j) {

		while (j >= 0) {
			if (s.charAt(j) != ' ')
				break;
			j--;
		}
		return s.substring(0,j+1);
	}
}