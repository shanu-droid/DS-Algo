package lists;

public class Mystack {

	public static void main(String[] args) throws Exception {
    generateStack<Integer> op= new generateStack<>();
//    op.push(23);
//    op.push(25);
//    op.push(27);
    int popped =op.pop();
   System.out.println(popped);
   int peeked= op.peek();
   System.out.println(peeked);
   
    
    
    
    
    
	}

}
