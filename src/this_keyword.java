//konstruktor B z parametrem jest wywołny w konstruktorze bez parametrów
class B {
    B() {
        this(5);
        System.out.println("HI B");
    }
    B(int b) {
        System.out.println(b);
    }
}
//wywołanie konstruktora bez parametrów przez słowo this
class A {
    A() {System.out.println();}  //this wywołuje konstruktor bezparametrowy
    A(int x) {
        this();
        System.out.println(x);
    }
}


public class this_keyword {
    int rollno;
    String name;
    float fee;
//kiedy nie dajemy this program nie wykrywa wartosci
    //jesli wartosc name w konstruktorze nie jest taka jak String name wtedy nie trzeba użwać this
    this_keyword(int rollno, String nameee, float fee) {
        rollno = rollno;
        name = nameee;
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + fee);
    }
////////////////////////////////////////////////////////////////////////
    //funkcja wypisuje Hello m
    void m(){
        System.out.println("Hello m");
    }
    //funkcja wypisuje hello n i wywołuje funkcje m()
    void n() {
        System.out.println("Hello n");
        m();
    }
/////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {
        this_keyword tk1 = new this_keyword(123,"Kan",34f);
        this_keyword tk2 = new this_keyword(3,"Jan",3454f);
        tk1.display();
        tk2.display();
        tk1.n();  //wywyłanie fnkcji n która wypisuje hello n i wywołuje funkcje n()

        A a = new A(10); //wywpłany jest konstruktor  parametrowy i przez this bezparametrowy
        B b = new B(); //bezparametrowy konstruktor wywołuje prametrowy przez this
    }

}
