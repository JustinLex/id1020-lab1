import java.util.Scanner;

public class ReadForwardDLL {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    s.useDelimiter(""); //change the scanner delimiter so s.next gives single characters instead of words

    CharDLL cdll = new CharDLL(); // init list

    while(true) { //loop to read in, character by character
      if(s.hasNext()) {
        char c = s.next().charAt(0); //read char
        if(c == '\n') //stop reading if new char is LF
          break;
        else
          cdll.add(c); //add new char to list
      }
    }

    while(!cdll.isEmpty()) { //empty list in order and print it
      System.out.print(cdll.getFirst());
      cdll.removeFirst();
    }

    System.out.println();
  }
}

class CharDLL {

  private MyElement first;
  private MyElement last;
  private int size;

  public CharDLL() {
    first = null;
    last = null;
    size = 0;
  }

  public void add(char c) {
    if(isEmpty()) { //init linked list if empty
      MyElement e = new MyElement(c, null, null);
      first = e;
      last = e;
      size = 1;
    }
    else {
      MyElement e = new MyElement(c, last, null);
      last.next = e;
      last = e;
      size++;
    }
  }

  public char getFirst() {
    return first.c;
  }

  public void removeFirst() {
    first = first.next;
    if(first != null)
      first.prev = null;
    size--;
  }

  public char pop() {
    //could throw an exception here if we're empty
    MyElement e = last; //retrieve last element
    last = e.prev; //move last pointer back
    e.next = null; //remove link to old last element
    size--;
    return e.c; //output char
  }

  boolean isEmpty() { return size == 0; }
  int size() { return size; }

}

class MyElement {
  public MyElement prev;
  public MyElement next;
  char c;

  public MyElement(char c, MyElement prev, MyElement next) {
    this.c = c;
    this.prev = prev;
    this.next = next;
  }
}
