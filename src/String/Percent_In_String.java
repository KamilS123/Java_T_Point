package String;

public class Percent_In_String {
    public static void main(String[] args) {
percent("KamiKadze???11");
    }
    public static void percent(String str) {
        int strlength = str.length();
        char[]cstr = str.toCharArray();
        int upper = 0;
        int lower = 0;
        int digits = 0;
        int other = 0;

        for(int i = 0; i<cstr.length; i++) {
            char znak = str.charAt(i);
            if(Character.isUpperCase(znak)) {
                upper++;
            } else if (Character.isLowerCase(znak)) {
                lower++;
            } else if (Character.isDigit(znak)) {
                digits++;
            } else {
                other++;
            }
        }

        double upperPercent = (upper*100)/strlength;
        double lowerPercent = (lower*100)/strlength;
        double digitsPercent = (digits*100)/strlength;
        double otherPercent = (other*100)/strlength;

        System.out.println(upperPercent + " %");
        System.out.println(lowerPercent + " %");
        System.out.println(digitsPercent + " %");
        System.out.println(otherPercent + " %");
    }
}
   // Program Java do wyszukiwania procentów wielkich, małych liter, cyfr i znaków specjalnych w ciągu znaków