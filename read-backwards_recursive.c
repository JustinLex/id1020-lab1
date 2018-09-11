#include <stdio.h>

int main() {
  processinput();
  return 0;
}

//print the characters before a newline recursively
void processinput(void) {
  char newchar = getchar();
  if(newchar == '\n') // end recursion once we hit a newline
    return;
  else {
    processinput(); //recurse
    printf(newchar); //print character on the way out of recursion
    return;
  }
}
