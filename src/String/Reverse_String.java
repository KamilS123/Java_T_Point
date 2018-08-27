package String;

public class Reverse_String {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str =  "nitin";
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(rev);

        if(str.equalsIgnoreCase(rev)) {
            System.out.println("This is polindrom");
        } else {
            System.out.println("Not polindrom");
        }
    }
}
