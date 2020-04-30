package mydsaldo.learn.mergeSort;

public class Main {

    public static void main(String[] args) {
	int arr[]={20,35,-15,7,55,1,-22};

     mergesort(arr,0,arr.length);



	for(int i=0;i<arr.length;i++){
	    System.out.println(arr[i]);
    }
    }

    public static void mergesort(int[] input,int start,int end){

         if(end-start<2){
             return;
         }
         int mid =(start+end)/2;
         mergesort(input,start,mid); //left sub-array
        mergesort(input,mid ,end); //right sub-array
        merge(input,start,mid,end);

    }
    public static void merge(int[] input, int start , int mid, int end){
        if(input[mid-1]<=input[mid]){
            return;
        }
        int i=start;
        int j=mid;
        int tempindex=0;
        int [] temp = new int[end-start];
        while(i<mid && j<end){
            temp[tempindex++]=input[i]<=input[j]?input[i++]:input[j++];

        }
        System.arraycopy(input ,i,input ,start+tempindex,mid-i);
        System.arraycopy(temp,0,input,start,tempindex);
    }
}
