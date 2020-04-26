package lists;
import java.io.*;
import java.util.*;

public class linkedlistex {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    ArrayList<ArrayList<Integer>> set = new ArrayList<>();
    
    for(int i=0;i<n;i++){
        int m=sc.nextInt();
        ArrayList<Integer> row = new ArrayList<>();
        for(int j=0;j<m;j++){
        
           row.add(sc.nextInt());
        }
        set.add(row);
        
    }
    int d=sc.nextInt();
    for(int k=1;k<=d;k++){
      int p=sc.nextInt();
      int x=sc.nextInt();
     try{
         System.out.println(set.get(p-1).get(x-1));
     }catch(Exception e){
         System.out.println("ERROR!");
     }
          
    }
   }
		
		

		  
}


