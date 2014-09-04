public class Solution {
	public List<String> letterCombinations(String digits) {
		String[] map = { "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		int slen = digits.length();
		List<String> lists = new ArrayList();
		if(slen==0) { 
			lists.add("");
			return lists;
		}
		
		for (int i = 0; i < slen; i++) {
			char digit=digits.charAt(i);
			if(digit>='0' && digit<='9'){
				int index = Integer.parseInt(String.valueOf(digit))-1;
				lists.add(map[index]);
			}else{
				lists.add("");
			}
		}
		return conbineLists(lists);
	}

	public List<String> conbineLists(List<String> list) {
		List<String> retlist = new ArrayList();
		List<String> temp=null;
		
		int len = list.size();
		for (int i = 0; i < len; i++) {
			String str = list.get(i);
			if(str!=""){
				int strlen=str.length();
				temp= new ArrayList();
				for(int j=0; j<strlen; j++){
					temp.add(String.valueOf(str.charAt(j)));
				}			
				retlist=multiply(retlist,temp);
			}		
		}		
		return retlist;
	}
	
	public List<String> multiply(List<String> list1, List<String> list2) {
		List<String> retlist = new ArrayList();
		if(list1.size()==0) return list2;
		if(list2.size()==0) return list1;
		
		int len1 = list1.size();
		int len2 = list2.size();
		for (int i = 0; i < len1; i++) {
			for(int j=0; j< len2; j++){
				String str1=list1.get(i);
				String str2=list2.get(j);
				retlist.add(str1+str2);
			}
		}
		return retlist;
	}
}