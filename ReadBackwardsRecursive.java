import java.util.Scanner;

public class ReadBackwardsRecursive {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    s.useDelimiter(""); //change the scanner delimiter so s.next gives single characters instead of words
    processInput(s);
    System.out.println();
  }

  private static void processInput(Scanner s) {
    char c = '\n';
    while(true) { //loop to wait for a new char
      if(s.hasNext()) {
        c = s.next().charAt(0); //read in the new char
        break;
      }
    }

    if(c == '\n') //stop recursion if we hit LF
      return;
    else {
      processInput(s); //recurse to handle a new character
      System.out.print(c); //print character as we exit recursion (printing in reverse order)
    }
  }
}
