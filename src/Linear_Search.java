import java.util.Arrays;

public class Linear_Search {
    public static void main(String[] args) {
        int[]arr = {3,2,5,65,7,54,34,32};
        System.out.println("Before sort\n" + Arrays.toString(arr));
        System.out.println(linerar_Search(arr,65));
    }
    public static int linerar_Search(int[]arr,int key) {
        for(int i = 0; i<arr.length; i++) {
            if(arr[i]==key) {
                return i;
            }
        }
        return -1;
    }
}
//zwraca indeks wyszukiwanej liczby