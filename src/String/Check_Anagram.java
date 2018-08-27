package String;

import java.util.Arrays;

public class Check_Anagram {
    public static void main(String[] args) {
check_anagram("Jak","Kaj");
//program sptawdza czy ze str1 można utworzyć str2 tworzy flagi true false;
    }
    public static void check_anagram(String str1, String str2) {
        String s1 = str1.replaceAll("\\s","");
        String s2 = str1.replaceAll("\\s","");
        boolean status = true;

        if(s1.length()!=s2.length()) {
            status = false;
        } else {
            char[]c1 = str1.toUpperCase().toCharArray();
            char[]c2 = str2.toUpperCase().toCharArray();
            Arrays.sort(c1);
            Arrays.sort(c2);
            status = Arrays.equals(c1,c2);
        }

        if(status == true ) {
            System.out.println("anagram");
        } else {
            System.out.println("Nie anagram");
        }
    }
}
