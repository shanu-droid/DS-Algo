package lists;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class linkedLists {
	public static void main(String[] args) {
		List<Integer> ll= new  LinkedList<>();
		List<Integer> mm= new ArrayList<>();
		getTimeDiff(ll);
		getTimeDiff(mm);
	}
	static void getTimeDiff(List<Integer> list) {
		long  start = System.currentTimeMillis();
		for(int i=0;i<100000;i++) {
			list.add(0,i);
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getName()+" -->"+(end-start));
	}

	
}
