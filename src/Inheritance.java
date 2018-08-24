class Animal {
    void eat() { System.out.println("Eating");
    }

}
//extends umożliwia klasie Dog uzywanie metod z klasy animals
class Dog extends Animal{
    void bark() {
        System.out.println("Barking");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("Weeping");
    }
        }

public class Inheritance {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        BabyDog bd = new BabyDog();
        bd.weep();
        bd.bark();
        bd.eat();
    }
}
