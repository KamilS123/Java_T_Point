package String;

public class Count_Number_Of_Words {
    public static void main(String[] args) {
countNumberOfWords("Co to jest ???");
count2("TO jest twoja wina");
    }
    public static void countNumberOfWords(String str) {
        String [] words = {str};
        int count = 0;
        char[]letters;
        for(int i = 0; i<str.length(); i++) {
            letters = str.toCharArray();

            if(letters[i]==' ') {
                count++;
            }
        }
        System.out.println(count + 1);

    }

    public static void count2(String str) {
        String[]strnumber = str.split("\\s");
        int length = strnumber.length;
        System.out.println(length);
    }
}
