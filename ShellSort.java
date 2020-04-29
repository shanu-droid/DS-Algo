package mydsaldo.learn.shellSort;

public class Main {

    public static void main(String[] args) {
        int[] ar = new int[]{23, -5, 89, 56, -4, -98, 87};

        int gap;
        for(gap = ar.length / 2; gap > 0; gap /= 2) {
            for(int i = gap; i < ar.length; ++i) {
                int newelement = ar[i];

                int j;
                for(j = i; j >= gap && ar[j - gap] > newelement; j -= gap) {
                    ar[j] = ar[j - gap];
                    ar[j - gap] = newelement;
                }

                ar[j] = newelement;
            }
        }

        for(gap = 0; gap < ar.length; gap++) {
            System.out.println(ar[gap]);
        }
    }
}
