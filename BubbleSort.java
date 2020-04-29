package mydsaldo.learn.Bubblesort;

public class Main {

    public static void main(String[] args) {
		int arr[] = {34, -9, 89, 10, -45, -10, 3, -8, 6};
		for (int lastunsortedindex = arr.length - 1; lastunsortedindex > 0; lastunsortedindex--) {
			for (int i = 0; i < lastunsortedindex; i++) {
				if (arr[i] > arr[i + 1]) {
					swap(arr, i, i + 1);
				}
			}
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
