#include <stdio.h>

int main() {
  int num_of_chars = 0; //track number of chars read
  int array[8]; //create array to hold text
  int array_size = 8; //track array size so we can stay inside it
  int* text = array; //point to array so we can swap it out

  do {
    text[num_of_chars] = getchar(); //read in char
    num_of_chars++; //update char count

    if(num_of_chars >= array_size) { //see if we need a bigger array
      int new_array[array_size*2]; //make new array
      int i;
      for(i = 0; i < array_size; i++) //copy over characters
        new_array[i] = text[i];
      text = new_array; //update pointer to new array
      array_size *= 2; //update array size
    }
  } while(text[num_of_chars - 1] != '\n'); //check if last character read was a newline

  int i;
  for(i = num_of_chars-1; i >= 0; i--) //print out string backwards, skip the newline at the end
    printf(&text[i]);

  printf("\n");
  return 0;
}
