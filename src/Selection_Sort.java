import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[]arr = {4,6,73,32,44,24,2};
        System.out.println("before sort\n" + Arrays.toString(arr));
        selection_Sort(arr);
        System.out.println("after sort\n" + Arrays.toString(arr));
    }
    public static void selection_Sort(int[]arr) {
        for(int i = 0; i<arr.length; i++) {
            int index = i;
            for(int j = i+1; j<arr.length; j++) {
                if(arr[j]<arr[index]) {
                    index = j;
                }
            }
            int smallNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallNumber;
        }
    }
}
