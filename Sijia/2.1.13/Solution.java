public class Solution {
	public boolean isValidSudoku(char[][] board) {

		/* the place to store the value of exist element */
		/* index is the value. pool[index]=1 means exist */
		int[] pool = new int[10];

		/* check rows */
		for (int r = 0; r < 9; r++) {
			resetPool(pool);
			for (int c = 0; c < 9; c++) {
				int cur = charConverter(board[r][c]);
				if (!isDuplicate(pool, cur)) {
					pool[cur] = 1;
				}
				else{
					return false;
				}
			}
		}

		/* check columns */
		for (int c = 0; c < 9; c++) {
			resetPool(pool);
			for (int r = 0; r < 9; r++) {
				int cur = charConverter(board[r][c]);
				if (!isDuplicate(pool, cur)) {
					pool[cur] = 1;
				}
				else{
					return false;
				}
			}
		}

		/* check square */
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				resetPool(pool);
				for (int m = 0; m < 3; m++) {
					for (int n = 0; n < 3; n++) {
						int cur = charConverter(board[3 * i + m][3 * j + n]);
						if (!isDuplicate(pool, cur)) {
							pool[cur] = 1;
						}
						else{
							return false;
						}
					}
				}
			}
		}

		return true;
	}

	public boolean isDuplicate(int[] pool, int value) {
		if (value == 0)
			return false;
		else {
			if (pool[value] == 0)
				return false;
			else {
				return true;
			}
		}
	}

	public void resetPool(int[] pool) {
		/* there is no number in pool */
		for (int i = 1; i < 10; i++) {
			pool[i] = 0;
		}
	}

	public int charConverter(char c) {
		if (c == '.')
			return 0;
		return Character.getNumericValue(c);
	}
}