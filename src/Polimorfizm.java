class Bank {
    float rateOfInterest(){return 0;}
}
class Nordea extends Bank{
    float rateOfInterest(){return 3;}
}
class MBank extends Bank{
    float rateOfInterest() {return 4;}
}
public class Polimorfizm {
    public static void main(String[] args) {
    Bank b;
    b = new Nordea();
        System.out.println(b.rateOfInterest());
    b = new MBank();
        System.out.println(b.rateOfInterest());
    }
}
