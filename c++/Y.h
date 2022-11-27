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
    B* foo(B *b){
      b -> beta();
      B* b2 = new Clase_C();
      return b2;
    }
};

#endif
