import java.util.Scanner;

public class ReadBackwardsRecursive {

  public static void main(String[] args) {
    System.out.println("Hello");
    Scanner s = new Scanner(System.in);
    s.useDelimiter(""); //change the scanner delimiter so s.next gives single characters instead of words
    processInput(s);
    System.out.println();
  }

  private static void processInput(Scanner s) {
    char c = '\n';
    while(true) {
      if(s.hasNext()) {
        c = s.next().charAt(0);
        break;
      }
    }

    if(c == '\n')
      return;
    else {
      processInput(s);
      System.out.print(c);
    }
  }
}
