package queue;
import java.util.*;
public class mainClass {

	public static void main(String[] args) {
		Queue<Integer> obj= new LinkedList<>();
		obj.add(34);
		obj.add(45);
		obj.add(89);
		System.out.println(obj);
		System.out.println(obj.remove());
		System.out.println(obj.remove());
		System.out.println(obj.remove());
		
		System.out.println(obj.poll());// its throw null for empty list
		System.out.println(obj.remove());// its throw exception but poll and remove do same thing to remove element

	}

}
