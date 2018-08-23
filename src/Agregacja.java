////////////////////////////////////////////////////
class Address {
    String city, state, country;

    Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
}
class Emp {
    int id;
    String name;
    Address address;

    Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display() {
        System.out.println(id + " " + name + " " + address.state + " " + address.city + " " + address.country);
    }
}
/////////////////////////////////////////////////////////////////
///////////////////////////////////////////
class Operation {
    int square(int s) {
        return s*s;
    }
}
class Circle {          //Klasa Circle używa obiektu Operation w metodzie area
    Operation op;
    double PI = 3.14;
    double area(int radious) {
        op = new Operation();
        int square = op.square(radious);
        return PI*square;
    }
}
///////////////////////////////////////////
public class Agregacja {
    public static void main(String[] args) {
        Circle c = new Circle();
       double wynik = c.area(3);
        System.out.println(wynik); //wyswietlenie metody area z obiektu Circle

        Address ad1 = new Address("WArsaw","Warsaw","Poland");

        Emp emp = new Emp(1,"Jan",ad1);
        Emp emp2 = new Emp(1,"ka",new Address("kj","ui","iu"));
        emp.display();
        emp2.display();
    }
}
