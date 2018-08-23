public class Factorial_number_silnia {
    public static void main(String[] args) {
        silnia(4);
    }
    public static void silnia(int numer) {
        int temp = 1;
        for(int i = 1; i<= numer; i++) {
            temp = temp * i;
        }
        System.out.println(temp);
    }
}
