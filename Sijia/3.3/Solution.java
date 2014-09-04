public class Solution {
	public int atoi(String str) {
		char[] array = str.toCharArray();
		int len = str.length();
		int i = 0;
		boolean positive = true;
		// space filter
		while (i < len) {
			if (array[i] == ' ') {
				i++;
			} else
				break;
		}
		if (i >= len)
			return 0;

		// optional + and -
		if (array[i] == '+' || array[i] == '-') {
			if (array[i] == '-')
				positive = false;
			i++;
		}
		if (i >= len)
			return 0;

		// first digit
		int st = i;
		if (array[i] >= '0' && array[i] <= '9') {
			i++;
		} else {
			return 0;
		}

		// more digit
		while (i < len) {
			if (array[i] >= '0' && array[i] <= '9') {
				i++;
			} else
				break;
		}
		int ed = i;
		str = String.valueOf(array);
		str = str.substring(st, ed);

		if (str.equals("")) {
			return 0;
		} else if (str.length() > 10) {
			if (positive)
				return Integer.MAX_VALUE;
			else {
				return Integer.MIN_VALUE;
			}
		} else if (str.length() == 10) {
			if (positive) {
				String max = Integer.toString(Integer.MAX_VALUE);
				if (str.compareTo(max) >= 0)
					return Integer.MAX_VALUE;
				else {
					return Integer.parseInt(str);
				}
			} else {
				String min = Integer.toString(Integer.MIN_VALUE);
				min = min.substring(1);
				if (str.compareTo(min) >= 0)
					return Integer.MIN_VALUE;
				else {
					return Integer.parseInt(str) * (-1);
				}
			}
		} else {
			if (positive) {
				return Integer.parseInt(str);
			} else {
				return Integer.parseInt(str) * (-1);
			}
		}
	}
}