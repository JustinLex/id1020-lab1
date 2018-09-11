#include <stdio.h>
int main() {
  processinput();
  return 0;
}

int processinput(void) {
  char newchar = getchar();
  if newchar == '\n'
    return
  else {
    processinput();
    printf(newchar);
  }
}
