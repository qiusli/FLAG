public class Solution {
	public int removeDuplicates(int[] A) {
		if (A == null)
			return 0;
		int len = A.length;
		if (len == 0 || len == 1)
			return len;

		/* record the current number */
		int cur = 0;
		int i = cur;
		while (i < len) {
			if (A[cur] == A[i]) {
				i++;
			} else {
				cur++;
				A[cur] = A[i];
			}
		}
		return cur+1;
	}
}