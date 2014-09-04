public class Solution {
	public boolean isNumber(String s) {
		boolean canHasDot = true;
		boolean canHasE = true;
		boolean afterE = false;
		boolean canEnd = false;
		char[] array = s.toCharArray();
		int len = array.length;
		int i = 0;
		while (i < len) {
			if (array[i] != ' ') {
				break;
			}
			i++;
		}
		if (canEnd==false&& i >= len) {
			return false;
		}

		if (array[i] == '+' || array[i] == '-') {
			i++;
		}
		if (canEnd == false && i>=len)
			return false;
			
		if (array[i] == '.') {
			i++;
			canHasDot = false;
		}
		if (canEnd == false && i>=len)
			return false;
		
		
		if (array[i] >= '0' && array[i] <= '9') {
			i++;
			canEnd = true;
		}
		else {
			return false;
		}

		while (i < len) {
			if (array[i] >= '0' && array[i] <= '9') {
				i++;
				afterE = false;
				canEnd = true;
			} else if (array[i] == '.' && canHasDot == true) {
				i++;
				canHasDot = false;
				canEnd = true;
			} else if (array[i] == 'e' && canHasE == true) {
				i++;
				canHasE = false;
				canHasDot = false;
				afterE = true;
				canEnd = false;
			} else if (array[i] == '+' || array[i] == '-') {
				if (afterE == true) {
					i++;
					canEnd = false;
				} else {
					return false;
				}
			} else if (array[i] == ' ' && canEnd == true) {
				break;
			} else {
				return false;
			}
		}
		if (canEnd == false)
			return false;

		while (i < len) {
			if (array[i] != ' ') {
				return false;
			}
			i++;
		}
		return true;
	}
}