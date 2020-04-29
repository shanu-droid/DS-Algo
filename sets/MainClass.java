package sets;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		Set<Integer> x= new HashSet<>();
		x.add(23);
		x.add(27);
		x.add(68);
		Set<Integer> y= new HashSet<>();
		y.add(23);
		y.add(68);
	
//		x.retainAll(y);
//		System.out.println(x);

	System.out.println(x.containsAll(y));
		
	}

}
