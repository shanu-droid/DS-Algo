package queue;

import lists.generateLinked.*;
public class generateQueue<E> {
 private Node<E> head,rear;
 public void enqueue(E e) {
	Node<E> toAdd = new Node(e);
	if(head==null) {
		head=rear=toAdd;
		return;
	}
	
	rear.next=toAdd;
	rear = rear.next;
 }
 public E peek() {
	 if(head==null) {
		 return null;
	 }
	 return head.data;
 }
 public E dequeue() {
	 if(head==null) {
		 return null;
	 }
	Node<E> temp=head;
	head=head.next;
	
	if(head == null) {
		rear=null;
	}
	return temp.data;
 }
}
