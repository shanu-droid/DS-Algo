package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayLists {

	public static void main(String[] args) {
		List<String> fruit= new LinkedList();
		List<String> vegitable= new ArrayList();
		List<String> removeAll= new ArrayList();
		
		
		fruit.add("Apple");
		fruit.add("mango");
		vegitable.add("carrot");
		vegitable.add("potato");
		vegitable.add("tomato");
		removeAll.add("banana");
		removeAll.add("potato");
		fruit.addAll(vegitable);
		fruit.set(2, "banana");
//		fruit.remove(3);
//		fruit.clear();
		fruit.removeAll(removeAll);
		
      System.out.println(fruit.get(2));
       System.out.println(fruit);
       System.out.println(fruit.size());
       System.out.println(fruit.contains("potato"));
       
       String temp[]= new String[fruit.size()];
       fruit.toArray(temp);
       for(String e:temp) {
    	   System.out.print(e+" ");
       }
//		Double x=45.0;
//		pair<String , Integer> p1= new pair("Shanu",22);
//		pair<Boolean, Character> p2= new pair(true,'C');
//		p1.getDiscription();
//		p2.getDiscription();
//		
	}

}
