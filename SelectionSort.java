package mydsaldo.learn.Selectionsort;

public class Main {

    public static void main(String[] args) {
	int arr[]={34,9,-80,5,-34,-4,56,23,0};
	for(int unsortedindex=arr.length-1;unsortedindex>0;unsortedindex--){
	   int largest=0;
	   for(int i=1;i<=unsortedindex;i++){
	       if(arr[i]>arr[largest]){
            largest =i;

           }
       }
	   swap(arr,largest,unsortedindex);
    }
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
}


    public static void swap(int[] ar, int i, int j){
        int temp=ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }
}
