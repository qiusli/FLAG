public class Solution {
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int N = gas.length;
		int sumFromZero = 0;
		int sumFromStart = 0;

		int[] diff = new int[N];
		for (int i = 0; i < N; i++) {
			diff[i] = gas[i] - cost[i];
		}

		int start=0;
		for (int count=0, i=start; count<N; count++) {
			sumFromZero+= diff[i];
			sumFromStart+=diff[i];
			if ( sumFromStart< 0) {
				sumFromStart = 0;
				i++;
				start=i;
			} else {
				i++;
			}
		}
		if((sumFromZero+sumFromStart)<0){
			return -1;
		}
		else{return start;}
	}
}