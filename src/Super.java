class Animal {
    String name;
    String surname;
    String color = "black";
    int number = 20;

    Animal(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
class Dog extends Animal{
    String color = "red";

    Dog(String name, String surname,String color) {
        super(name, surname);
        this.color = color;
    }
    void sound() {
        System.out.println(super.color);
    }
}
public class Super {
    public static void main(String[] args) {
        Dog dog = new Dog("Papuga","Kowalska", "Czerwony");
        dog.sound();
    }
}
