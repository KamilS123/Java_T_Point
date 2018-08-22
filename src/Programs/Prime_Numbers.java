package Programs;

public class Prime_Numbers {
    public static void main(String[] args) {
        prime(12);
        prime2(11);
    }
    public static void prime(int number) {
        int flag=0;
        if((number==0)||(number==1)) {
            System.out.println("This is not a prime number");
        } else {
            for(int i = 2; i<number/2; i++) {
                if(number%i==0) {
                    System.out.println(number+" Not a prime");
                    flag = 1;
                    break;
                }
            }
            if(flag==0)
                System.out.println(number + " Is a prime");
        }
    }
    public static void prime2(int num) {
        int flaga = 0;
        if((num==0)||(num==1)){
            System.out.println("Not a prime number");
        } else {
            for(int i = 2; i<num/2; i++) {
                if (num%i==0) {
                    System.out.println("Not a prime");
                    flaga = 1;
                }
            }
        }
        if(flaga==0)
            System.out.println(num + " is Prime");
    }
}
