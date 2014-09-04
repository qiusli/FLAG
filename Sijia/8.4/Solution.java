public class Solution {
	public List<List<Integer>> permute(int[] num) {
		List<List<Integer>> lists = new ArrayList();
		List<Integer> list = new ArrayList();
		sortArray(num);
		lists.add(getList(num));
		while(getNext(num)){
			lists.add(getList(num));
		}
		return lists;
	}

	public boolean getNext(int[] num) {
		int parNum = -1;
		int chgNum = -1;
		int len = num.length;
		for (int i = len - 1; i > 0; i--) {
			if (num[i] > num[i - 1]) {
				parNum = i - 1;
				break;
			}
		}
		if (parNum == -1)
			return false;

		for (int i = len - 1; i > 0; i--) {
			if (num[i] > num[parNum]) {
				chgNum = i;
				break;
			}
		}
		int temp=num[chgNum];
		num[chgNum]=num[parNum];
		num[parNum]=temp;
		reverse(num, parNum+1, len-1);
		return true;
	}

	public void reverse(int[] num, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			for (int i = start; i <= mid; i++) {
				int temp=num[i];
				num[i] = num[end + start - i];
				num[end+start-i]=temp;
			}
		}
	}

	public List<Integer> getList(int[] num) {
		List<Integer> list = new ArrayList<Integer>();
		int len = num.length;
		int i = 0;
		while (i < len) {
			list.add(num[i]);
			i++;
		}
		return list;
	}

	public void sortArray(int[] num) {
		int len = num.length;
		int i, j = 0;
		int cur = num[j];
		while (j < len) {
			cur = num[j];
			i = j - 1;
			while (i >= 0) {
				if (cur < num[i]) {
					num[i + 1] = num[i];
					i--;
				} else {
					break;
				}
			}
			num[i + 1] = cur;
			j++;
		}
	}
}