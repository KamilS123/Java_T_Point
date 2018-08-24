<<<<<<< HEAD:src/Search/Binary_Search.java
package Search;
=======
import java.util.Arrays;
>>>>>>> 1df47bcf8af5ee7a44d91644be06316d9c634957:src/Binary_Search.java

public class Binary_Search {
    public static void main(String[] args) {
        int[]arr = {4,67,3,23,1,43,6};
        System.out.println("Before search\n" + Arrays.toString(arr));
        binary_Search(arr,1,6,23);
    }
    public static void binary_Search(int[]arr, int first, int last, int key) {
        int mid = (first+last)/2;

        while(first<=last) {
            if(arr[mid]<key) {
                first = mid + 1;
            } else if (arr[mid]==key) {
                System.out.println("Element found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last)/2;
        }
        if(first>last) {
            System.out.println("Element not found");
        }
    }
}
