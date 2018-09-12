import java.util.Scanner;

public class ReadBackwardsADT {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    s.useDelimiter(""); //change the scanner delimiter so s.next gives single characters instead of words

    CharStack cs = new CharStack(); // init stack

    while(true) { //loop to read in, character by character
      if(s.hasNext()) {
        char c = s.next().charAt(0); //read char
        if(c == '\n') //stop reading if new char is LF
          break;
        else
          cs.push(c); //add new char to stack
      }
    }

    while(!cs.isEmpty()) { //empty stack and print it
      System.out.print(cs.pop());
    }

    System.out.println();
  }

  static private class CharStack {

    private char[] array;
    private int items;

    public CharStack() {
      array = new char[8];
      items = 0;
    }

    public void push(char c) {
      if(items >= array.length)
        growArray();
      array[items] = c;
      items++;
    }

    public char pop() {
      //could throw an exception here if we're empty
      items--;
      return array[items];
    }

    boolean isEmpty() { return items == 0; }
    int size() { return items; }

    private void growArray() { //copy array into a bigger array
      char[] newArray = new char[array.length*2];
      for(int i = 0; i < array.length; i++)
        newArray[i] = array[i];
      array = newArray;
    }

  }
}
