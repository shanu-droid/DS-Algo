package mydsaldo.learn.Insetionsort;

public class Main {

    public static void main(String[] args) {
	int arr[]={45,86,4,-8,-4,-36,32,-32};
	for(int unsortedindex=1;unsortedindex<arr.length;unsortedindex++){

	    for(int sorted=0;sorted<unsortedindex;sorted++){
	        int insertelement=arr[unsortedindex];
	       if(arr[sorted]>arr[unsortedindex]){
            arr[unsortedindex]=arr[sorted];
            arr[sorted]=insertelement;
           }
        }
    }
	for(int i=0;i<arr.length;i++){
	    System.out.println(arr[i]);
    }
    }
}
