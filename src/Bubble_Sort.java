import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[]arr = {3,23,2,12,4,54,6,43};
        System.out.println("Before sort\n" + Arrays.toString(arr));
        System.out.println("After sort\n");
        bubble_Sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    public static void bubble_Sort(int[]arr) {
        int n = arr.length;
        int temp = 0;

        for(int i = 0; i<n; i++) {
            for(int j = 1; j<(n-1); j++) {
                if(arr[j-1]>arr[j]) {
                    //swap elements
                    temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j] = temp;

                }
            }
        }
    }
}
