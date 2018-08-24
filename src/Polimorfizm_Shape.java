class Shape {
    int number = 3;
    void draw() {
        System.out.println("Drawing");
    }
}
class Triangle extends Shape{
    int number = 5;
    void draw() {

        System.out.println("Drawing triangle");
    }
}
class Circle extends Shape{
    int number = 6;   //wartości nie zostają nadpisane, nie działa plimorfizm

    void draw() {
        System.out.println("drawing circle");
    }
}

public class Polimorfizm_Shape {
    public static void main(String[] args) {
    Shape s = new Circle();
        System.out.println(s.number); //wyswietla 3 a nie 6 bo nie działa polimorfizm na wartosciach
    s = new Triangle();
    s.draw(); //wyswietla drawing triangle bo dział polimorfizm na metodzie
    }
}
