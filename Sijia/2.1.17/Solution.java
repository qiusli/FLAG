public class Solution {
	public int climbStairs(int n) {
		return dynamic(n);
	}

	public int dynamic(int n) {
		/* # of steps from k to n stair */
		if(n==1) {return 1;}
		if(n==2) {return 2;} 
		
		int[] stepRecord = new int[n];
		/* initial state: */
		stepRecord[n - 1] = 1;
		stepRecord[n - 2] = 2;

		/* then:*/
		for (int i = n - 3; i >= 0; i--) {
			stepRecord[i]=stepRecord[i+1]+ stepRecord[i+2];
		}
		return stepRecord[0];
	}
}