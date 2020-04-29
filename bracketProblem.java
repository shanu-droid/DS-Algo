package lists;

import java.util.Scanner;
import java.util.Stack;

public class bracketProblem {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		 sc.nextLine();
		 while(t--!=0) {
         String str=sc.nextLine();
         Stack<Character> stc= new Stack<>();
         boolean isBalance=true;
         for(int i=0;i<str.length();i++) {
        	 char ch=str.charAt(i);
        	 if(ch=='{' || ch== '[' || ch =='(' ) {
        		stc.push(ch) ;
        		continue;
        	 }
        	 if(stc.isEmpty()) {
        		 isBalance=false;
        		 break;
        	 }
        	 if(ch==')') {
        		 if(stc.peek()=='(') {
        			 stc.pop();
        			 
        		 }
        		 else {
        			 isBalance = false;
        			 break;
        		 }
        	 }
        		 if(ch=='}') {
            		 if(stc.peek()=='{') {
            			 stc.pop();
            			 
            		 }
            		 else {
            			 isBalance = false;
            			 break;
            		 }
        	     }
        		 if(ch==']') {
            		 if(stc.peek()=='[') {
            			 stc.pop();
            			 
            		 }
            		 else {
            			 isBalance = false;
            			 break;
            		 }
        	 
                 }
          
		 }
         if(!stc.isEmpty()) {
        	 isBalance=false;
         }
         if(isBalance) {
        	 System.out.println("Paired");
         }
         else 
        	 System.out.println("Not paired");
         
         
         
	
	
		 }     
	}
	}
	
