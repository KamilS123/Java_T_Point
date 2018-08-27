package String;

import java.util.Arrays;

public class Remove_White_Spaces {
    public static void main(String[] args) {
    remoweWhiteSpaces("Kowalski Jan Co nie");
    }
    public static void remoweWhiteSpaces(String str) {
        StringBuffer strbuffer = new StringBuffer();
        char[]chars = str.toCharArray();
        char[]charsNew = {};
        for(int i = 0; i<chars.length; i++) {
            if((chars[i]!=' ')&&(chars[i]!='\t')) {
                //charsNew[i] = chars[i];
                strbuffer.append(chars[i]);
            }
        }
        System.out.println(strbuffer);
    }
}
