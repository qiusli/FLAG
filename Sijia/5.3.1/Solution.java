public class Solution {
	public int numTrees(int n) {
		if (n <= 2) {
			return n;
		} else {
			int sum = 0;
			sum = 2 * numTrees(n - 1);
			int i=1;
			for (i = 1; i <= n / 2 - 1; i++) {
				sum +=  2* numTrees(n - 1 - i )* numTrees(i);
			}
			
			if (n % 2 == 0) {
				
			} else {
				sum += numTrees(i)* numTrees(i);
			}
			return sum;
		}
	}
}