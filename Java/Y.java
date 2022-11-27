public class Y extends X {

    @Override
    public B foo(B b) {
        b.beta();
        System.out.println("Hola soy beta desde Y");
        B b2 = new Clase_C();
        return b2;
    }

}
