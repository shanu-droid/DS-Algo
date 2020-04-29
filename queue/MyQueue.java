package queue;

public class MyQueue {

	public static void main(String[] args) {
		generateQueue<Integer> myq= new generateQueue<>();
		myq.enqueue(23);
		myq.enqueue(54);
		myq.enqueue(78);
		System.out.println(myq.peek());
		System.out.println(myq.dequeue());
		System.out.println(myq.dequeue());
		System.out.println(myq.dequeue());
		System.out.println(myq.dequeue());
		myq.enqueue(67);
		System.out.println(myq.dequeue());
	}

}
