#include "X.h"
#include "Y.h"
#include "Clase_A.h"
#include "Clase_B.h"
#include "Clase_C.h"

int main(){
  X* y = new Y();
  B* b = new Clase_B();
  B* c = new Clase_C();
  y->foo(b);
  y->foo(c);
}
