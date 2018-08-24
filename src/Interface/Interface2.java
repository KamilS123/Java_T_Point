package Interface;
interface printable {
    void print();
}
class A6 implements printable {
    @Override
    public void print() {
        System.out.println("Printing");
    }
}
public class Interface2 {
    public static void main(String[] args) {
A6 obj = new A6();
obj.print();
    }
}
