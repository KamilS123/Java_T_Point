package String;

import java.util.Arrays;

public class tOGGLE {
    public static void main(String[] args) {
        String str = "kamil jest slepy";
        String firstPart = str.substring(0,1);
        String secondPart = str.substring(1);
        String sum = firstPart + secondPart.toUpperCase();
        System.out.println(sum);

        String [] words = str.split("\\s");
        System.out.println(Arrays.toString(words));
        for(String s: words) {
            String first = s.substring(0,1);
            String second = s.substring(1).toUpperCase();
            String full = first + second;
            String rev = new StringBuilder(full).reverse().toString();
            System.out.println(rev);
        }
    }
}
