public class Y extends X {

    /* 
    @Override
    public B foo(B b) {
        b.beta();
        System.out.println("Hola soy beta desde Y");
        B b2 = new Clase_C();
        return b2;
    }
    */

    /*
    public A foo(B b) {
        b.beta();
        System.out.println("Hola soy beta desde Y");
        B b2 = new Clase_C();
        return b2;
    }
    */
    /*
    public C foo(B b) {
        b.beta();
        System.out.println("Hola soy beta desde Y");
        C c = new Clase_C();
        return c;
    }
    */
    public B foo(C c) {
        c.beta();
        System.out.println("Hola soy beta desde Y");
        B b = new Clase_C();
        return b;
    }

}
