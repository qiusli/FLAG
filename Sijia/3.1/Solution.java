public class Solution {
	public boolean isPalindrome(String s) {
		if (s.length() < 2)
			return true;
		int len = s.length();

		char chi = '\0', chj = '\0';
		int i = 0, j = len - 1;

		while (i <= j) {
			chi = s.charAt(i);
			chj = s.charAt(j);
			/* elem at index i is a char */
			if (isCharacter(chi) && isCharacter(chj)) {
				if (!isEqual(chi, chj))
					return false;
				i++;
				j--;
			} else if (!isCharacter(chi) && isCharacter(chj)) {
				i++;
			} else if (isCharacter(chi) && !isCharacter(chj)) {
				j--;
			} else {
				i++;
				j--;
			}
		}
		return true;
	}
	public boolean isCharacter(char ch) {
		if ((ch >= 97 && ch <= 122) || (ch >= 65 && ch <= 90)) {
			return true;
		} else
			return false;
	}
	public boolean isEqual(char ch1, char ch2) {
		if (ch1 == ch2 || Math.abs(ch1 - ch2) == 32)
			return true;
		else
			return false;
	}
}