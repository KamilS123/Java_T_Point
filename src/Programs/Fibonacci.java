package Programs;

public class Fibonacci {
    public static void main(String[] args) {
         fibo2(10);

    }
    public static void fibo() {
        int n1 = 0, n2 = 1, n3, count = 10;
        System.out.print(n1 + " " + n2);

        for(int i = 2; i<count; i++) {
            n3 = n1+n2;
            System.out.print(" " + n3);
            n1=n2;
            n2=n3;
        }
    }
    public static void fibo2(int c) {
        int zero = 0, one = 1, two;
        System.out.print(zero + " " + one);

        for(int i = 2; i<c; i++) {
            two = zero + one;
            System.out.print(" " + two);
            zero=one;
            one=two;
        }
    }
}
