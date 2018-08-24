<<<<<<< HEAD:src/Programs/Factorial_number_silnia.java
package Programs;

=======
>>>>>>> 1df47bcf8af5ee7a44d91644be06316d9c634957:src/Factorial_number_silnia.java
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
