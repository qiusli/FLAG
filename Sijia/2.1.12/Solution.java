public class Solution {
	public String getPermutation(int n, int k) {
		String s="";
		
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i] = i + 1;
		}
			num = implementation(num, n, k-1);
		
		for(int i=0;i<num.length;i++){
			s=s+Integer.toString(num[i]);
		}
		return s;
	}

	public int[] implementation(int[] num, int n, int k) {
		int denominator = 1;
		for (int i = n - 1; i >= 2; i--) {
			denominator = i * denominator; /* (n-1)(n-2)...1 */
		}

		int remainder = 0;
		int quotient = 0;
		for (int i = n - 1, curIndex = 0; i >= 1; i--, curIndex++) {
			quotient = k / denominator;
			int temp = getNthNum(num, quotient + 1, curIndex);
			swapTwo(num, curIndex, findValueIndex(num, temp));
			remainder = k % denominator;
			k = remainder;
			denominator = denominator / i;
		}
		return num;
	}

	public int findValueIndex(int[] num, int value) {
		for (int i = 0; i < num.length; i++) {
			if (num[i] == value)
				return i;
		}
		return -1;
	}

	public int getNthNum(int[] num, int N, int start) {
		reorder(num, start);
		return num[start + N - 1];
	}

	public void reorder(int[] num, int start) {

			for (int i = start + 1; i < num.length; i++) {
				int key = num[i];
				int j = i - 1;
				while (j >= start && num[j] > key) {
					num[j + 1] = num[j];
					j = j - 1;
				}
				num[j + 1] = key;
			}
		
	}

	public void swapTwo(int[] num, int index1, int index2) {
		int temp = num[index1];
		num[index1] = num[index2];
		num[index2] = temp;
	}
}