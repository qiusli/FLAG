public class Solution {
	public void merge(int A[], int m, int B[], int n) {
		int x = m + n - 1;
		int i = m - 1;
		int j = n - 1;
		for (; (x >= 0) && (i >= 0) && (j >= 0); x--) {
			if (A[i] > B[j]) {
				A[x] = A[i];
				i--;
			} else {
				A[x] = B[j];
				j--;
			}
		}
		for (; (x >= 0) && (i >= 0); x--) {
			A[x] = A[i];
			i--;
		}
		for (; (x >= 0) && (j >= 0); x--) {
			A[x] = B[j];
			j--;
		}
	}
}