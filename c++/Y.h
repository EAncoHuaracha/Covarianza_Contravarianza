#ifndef Y_H
#define Y_H
#include <iostream>
#include "A.h"
#include "C.h"
#include "Clase_B.h"
#include "Clase_C.h"
#include "X.h"

class Y: public X{
  public:
    /*
    B* foo(B *b){
      b -> beta();
      B* b2 = new Clase_C();
      return b2;
    }
    */

    /*
    // Contravarianza no es aceptada
    A* foo(B *b){
      b -> beta();
      B* b2 = new Clase_C();
      return b2;
    }
    */

    /*
    // Covarianza si es aceptada 
    C* foo(B *b){
      b -> beta();
      std::cout << "Hola soy beta desde Y\n";
      C* b2 = new Clase_C();
      return b2;
    }
    */

    /* 
    B* foo(C *c){
      c -> beta();
      std::cout << "Hola soy beta Y\n";
      B* b = new Clase_C();
      return b;
    }
    */
   
    // contravarianza recibiendo nos muestra error 
    B* foo(A *a){
      a -> alpha();
      std::cout << "Hola soy alpha desde Y\n";
      B* b = new Clase_C();
      return b;
};

#endif
