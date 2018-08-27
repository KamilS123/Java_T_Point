public class Reusing_constructor {
    String name;
    int age;
    String surname;

    Reusing_constructor(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Reusing_constructor(String name, String surname, int age) {
        this(name,age);
        this.surname = surname;
    }

    void display() {
        System.out.println(name + " " + surname + " " + age);
    }

    public static void main(String[] args) {
Reusing_constructor re = new Reusing_constructor("Kamil","Jankowski",34);
re.display();
    }
}
