package interviewQuestion;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
		Solution sol= new Solution();
		int a[]= {4,3,2,1,5,3,4,7,1,9};
		
		int anw[] = sol.maxSlidingWindow(a, 4);
		for(int x:anw) {
			System.out.print(x+" ");
		}
	}
		
		static class Solution {
			public int[] maxSlidingWindow(int[] a, int k) {
				int  n=a.length;
				if(n<=1)
					return a;
				Deque<Integer> dp = new LinkedList<>();
				int ans[] = new int[n-k+1];
				int i=0;
				for( ;i<k;i++) {
					while(!dp.isEmpty() && a[dp.peekLast()]<=a[i])	{
						dp.removeLast();
					}	
					dp.addLast(i);
					}
				for(;i<n;i++) {
					ans[i-k]= a[dp.peekFirst()];
				
				while(!dp.isEmpty() && dp.peekFirst() <= i-k) {
					dp.removeFirst();
				}
				while(!dp.isEmpty() && a[dp.peekLast()]<=a[i])	{
					dp.removeLast();
				}	
				dp.addLast(i);
				}
				ans[i-k]=a[dp.peekFirst()];
				return ans;
			}
			
		
		

	}
}


