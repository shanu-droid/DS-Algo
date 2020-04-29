package lists;
import lists.generateLinked;
public class generateStack<E> {

private generateLinked<E> obj = new generateLinked<>();
void push(E e) {
	obj.add(e);
}
E pop() throws Exception{
	if(obj.isEmpty()) {
		throw new Exception("poping from empty stack is not allowed");
	}
	return obj.removeLast();
}
E peek() throws Exception {
	if(obj.isEmpty()) {
		throw new Exception("peeking from empty stack is not allowed");
	}
	return obj.getLast();
}
	

	}


