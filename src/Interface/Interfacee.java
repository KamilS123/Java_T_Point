package Interface;

interface A {
    void a();
    void b();
    void c();
    void d();
}
abstract class B implements A {
    public void c(){
        System.out.println("I am c");
    }
}
 class C extends B {

    public void a() {
        System.out.println("I am a");
    }
    public void b() {
        System.out.println("I am b");
    }
    public void d() {
        System.out.println("I am d");
    }
}
public class Interfacee {
    public static void main(String[] args) {
        A al = new C();
        al.a();
        al.b();
        al.c();
        al.d();

    }
}
