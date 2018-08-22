package Programs;

import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {
        //polindrom(258);
        //polindrom2();
        polindrom3();
    }
    public static void polindrom(int number) {
        int r,sum=0,temp;
        temp=number;
        while(number>0) {
            r=number%10;
            sum=(sum*10)+r;
            number=number/10;
        }
        if(temp==sum)
            System.out.println("palindrome number");
        else
            System.out.println("not polindrome");
    }
    public static void polindrom2() {
        String original, reverse = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check");
        original = scanner.next();

        int length = original.length();

        for (int i = length - 1; i >= 0; i--)
            reverse = reverse + original.charAt(i);

            if (original.equals(reverse))
                System.out.println("Polindrom");
            else
                System.out.println("Not polindrom");
    }
    public static void polindrom3() {
        String original, reverse = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String to check\n");
        original = scanner.next();
        int leng = original.length();

        for(int i = leng-1; i>=0; i--)
            reverse = reverse + original.charAt(i);

            if(reverse.equals(original))
                System.out.println("Polindrom");
             else
                System.out.println("Not polindrom");


    }

}
