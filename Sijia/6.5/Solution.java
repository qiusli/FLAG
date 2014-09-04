public class Solution {
	public void sortColors(int[] A) {
		int len = A.length;
		int i = 0;
		int j = len - 1;
		int r = 0;
		if(len<=1){
			
		}
		else if (len == 2) {
			if (A[0] > A[1]) {
				swap(A, 0, 1);
			}
		} else {
			while (i < j) {
				if (A[i] == 0) {
					i++;
				}
				if (A[j] == 2) {
					j--;
				}
				if(i>=j)break;
				r = i;
				if (A[i] == A[j] && A[j] == 1) {
					while (A[i] == 1 && r < j) {
						swap(A, i, r);
						r++;
					}
					if (A[i] == 1 && r >= j)
						break;
				}
				if (A[i] > A[j]) {
					swap(A, i, j);
				} else if (A[i] < A[j]) {

				}
			}
		}
	}

	public void findRB(int[] A, int i) {
		int r = i + 1;
		int len = A.length;
		while (A[i] == 1 && r < len) {
			swap(A, i, r);
			r++;
		}
	}

	public void swap(int[] A, int i, int j) {
		int temp = A[i];
		A[i] = A[j];
		A[j] = temp;
	}
}