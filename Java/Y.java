public class Y extends X {

    
    @Override
    public B foo(B b) {
        b.beta();
        System.out.println("Hola soy beta desde Y");
        return b;
    }
    
    /* 
    public A foo(B b) {
        b.beta();
        System.out.println("Hola soy beta desde Y");
        return b;
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
    /*
    public B foo(C c) {
        c.beta();
        System.out.println("Hola soy beta desde Y");
        return c;
    }
    */
    /* 
    public B foo(A a) {
        a.alpha();
        System.out.println("Hola soy alpha desde Y");
        return a;
    }
    */
}
