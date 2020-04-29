package sets;

import java.util.*;

public class subArrayWithZeroSum {

	public static void main(String[] args) {
		int a[]= {2,-1,3,-4,2};
		int k=1;
		boolean found=false;
//		for(int i=0;i<a.length;i++) {
//			int sum=0;
//			for(int j=i;j<a.length;j++) {
//				sum+=a[j];
//				if(sum==0) {
//					found = true;
//					break;
//				}
//			}
//		
//			if(found) 
//				break;
//		}
//			
		Set<Integer> set= new HashSet<>();
		int sum=0;
		for(int e: a) {
			set.add(sum);
			sum+=e;
			if(set.contains(sum - k)){
				found = true;
				break;
			}
		}
		System.out.println("found "+ found);
	}

}
