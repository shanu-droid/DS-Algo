package lists;
import java.io.*;
import java.util.*;


public class InsertAndDelete {

	
		
		

		    public static void main(String[] args) {
		      Scanner sc= new Scanner (System.in);
		      int n= sc.nextInt();
		      ArrayList<Integer> arr= new ArrayList<Integer>();
		      for(int i=0;i<n;i++){
		          arr.add(sc.nextInt());
		      }
		      int d = sc.nextInt();
		      for(int j=1;j<=d;j++){
		    	  sc.nextLine();// clearing a buffer is important in taking input string
		          String st = sc.nextLine();
		          
		          if(st.equals("Insert")){
		              int x= sc.nextInt();
		              int y= sc.nextInt();
		              arr.add(x,y);
		          }
		          else{
		              int p= sc.nextInt();
		              arr.remove(p);
		          }
		      }
		      for(int i=0;i<arr.size();i++) {
		    	  System.out.print(arr.get(i)+" ");
		      }
		    }
		

	}


