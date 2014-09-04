public class Solution {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> lists = new ArrayList();
		List<Integer> list = null;

		return combine(1, n, k);
	}

	public List<List<Integer>> combine(int start, int end, int k) {
		List<List<Integer>> lists = new ArrayList();
		List<Integer> list = null;
		if (end == start) {
			list = new ArrayList();
			list.add(start);
			lists.add(list);
			return lists;
		} else {
			for (int i = start; i <= (end - k + 1); i++) {
				if (k == 1) {
					list = new ArrayList();
					list.add(i);
					lists.add(list);
				} else {
					List<List<Integer>> rightlists = new ArrayList();
					rightlists = combine(i + 1, end, k - 1);
					Iterator<List<Integer>> it = rightlists.iterator();
					while (it.hasNext()) {
						list = new ArrayList();
						list.add(i);
						list.addAll(it.next());
						lists.add(list);
					}
				}
			}
		}
		return lists;
	}
}