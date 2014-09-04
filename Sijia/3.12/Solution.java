public class Solution {
	public String countAndSay(int n) {
		String str = "1";
		for (int i = 1; i < n; i++) {
			str = next(str);
		}
		return str;
	}

	public String next(String str) {
		int len = str.length();
		String retStr = "";
		int curCount;
		char curValue;
		int i = 0;
		while (i < len) {
			curValue = str.charAt(i);
			curCount = 0;
			int j = i;
			while (j < len) {
				if (curValue == str.charAt(j)) {
					curCount++;
					j++;
				} else {
					break;
				}
			}
			i = j;
			retStr = retStr + String.valueOf(curCount)
					+ String.valueOf(curValue);
		}
		return retStr;
	}
}