package String;

import com.sun.javafx.binding.StringFormatter;

public class Reverse_Each_Word {
    public static void main(String[] args) {
        String str = "Masło jest Niedobre";
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(rev);


    }
}
