package mydsaldo.learn.Insertionsort2;

public class Main {

    public static void main(String[] args) {
	int arr[]={32,0,78,43,9,6,-12,7,-32};
	 for(int firstunsortedindex=1;firstunsortedindex<arr.length;firstunsortedindex++){
	     int newElement=arr[firstunsortedindex];
	     int i;
	     for(i=firstunsortedindex;i>0 && arr[i-1]>newElement;i--){
           arr[i]=arr[i-1];

         }
	     arr[i]=newElement;
     }
	 for(int i=0;i<arr.length;i++){
	 	System.out.println(arr[i]);
	 }
    }
}
