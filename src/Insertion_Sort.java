import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[]arr = {3,2,53,32,1,23,5,43};
        System.out.println("Before sort\n" + Arrays.toString(arr));
        insertion_Sort(arr);
        System.out.println("After sort\n" + Arrays.toString(arr));
    }
    public static void insertion_Sort(int[]arr) {
        int n = arr.length;

        for(int j = 1; j<n; j++) {
            int key = arr[j];
            int i = j-1;
            while((i>-1)&&(arr[i]>key)) {
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }
    }
}
