package mydsaldo.learn.factorialAlgo;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(recursiveFactorial(n));
        System.out.println(iterativeFactorial(n));
    }
    public static int recursiveFactorial(int num){
        if(num==0){
            return 1;
        }
        return num*recursiveFactorial(num-1);
    }


	public static int iterativeFactorial( int num){
            int fact = 1;
            if (num == 0) {
                fact = 1;
            } else {
                for (int i = num; i > 0; i--) {
                    fact *= i;

                }
            }
           return fact;
        }
    }

