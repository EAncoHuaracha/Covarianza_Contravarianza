public class Main {
    public static void main(String[] args) {
        X y = new Y();
        // B a = new Clase_A();
        B b = new Clase_B();
        B c = new Clase_C();
        y.foo(b);
        y.foo(c);
    }
}