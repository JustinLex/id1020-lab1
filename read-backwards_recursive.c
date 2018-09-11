// "README"
// takes characters + a newline char and prints them back in reverse order using
// a recursive algorithm
#include <stdio.h>

int main() {
  processinput();
  printf("\n");
  return 0;
}

//print the characters before a newline recursively
void processinput(void) {
  int newchar = getchar();
  if(newchar == '\n') // end recursion once we hit a newline
    return;
  else {
    processinput(); //recurse
    printf(&newchar); //print character on the way out of recursion
    return;
  }
}
