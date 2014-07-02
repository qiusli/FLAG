public class Solution {
	public int[] plusOne(int[] digits) {
		int carryBit = 0;
		int len = digits.length;
		for (int i = len - 1; i >= 0; i--) {
			if (i == len - 1) {
				if (digits[i] + 1 >= 10) {
					digits[i] = digits[i] + 1 - 10;
					carryBit = 1;
				} else {
					digits[i] = digits[i] + 1;
					carryBit = 0;
				}
			} else {
				if ((digits[i] + carryBit) >= 10) {
					digits[i] = digits[i] + carryBit - 10;
					carryBit = 1;
				} else {
					digits[i] = digits[i] + carryBit;
					carryBit = 0;
				}
			}
		}
		return formatResArray(digits, carryBit);
	}

	public int[] formatResArray(int[] resArray, int carryBit) {
		if (carryBit == 1) {
			/* the case that a new digits array is needed (length add 1) */
			int[] newArray = new int[resArray.length + 1];
			newArray[0] = 1;
			for (int i = 0; i < resArray.length; i++) {
				newArray[i + 1] = resArray[i];
			}
			return newArray;
		} else {
			return resArray;
		}
	}

}