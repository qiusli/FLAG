public class Solution {
	public void setZeroes(int[][] matrix) {
		int rLen = matrix.length;
		int cLen = matrix[0].length;
		int[] zeroRows = new int[rLen];
		int[] zeroColumns = new int[cLen];
		scanMatrix(matrix, zeroRows, zeroColumns);
		setRows(matrix, zeroRows, zeroColumns);
	}

	public void scanMatrix(int[][] matrix, int[] zeroRows, int[] zeroColumns) {
		for (int r = 0; r < zeroRows.length; r++) {
			for (int c = 0; c < zeroColumns.length; c++) {
				if (matrix[r][c] == 0) {
					zeroRows[r] = 1;
					zeroColumns[c] = 1;
				}
			}
		}
	}

	public void setRows(int[][] matrix, int[] zeroRows, int[] zeroColumns) {
		for (int r = 0; r < zeroRows.length; r++) {
			for (int c = 0; c < zeroColumns.length; c++) {
				if (zeroRows[r] == 1 || zeroColumns[c]==1) 
					matrix[r][c] = 0;
			}
		}
	}
}