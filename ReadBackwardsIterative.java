import java.util.Scanner;

public class ReadBackwardsIterative {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    s.useDelimiter(""); //change the scanner delimiter so s.next gives single characters instead of words
    processInput(s);
    System.out.println();
  }

  private static void processInput(Scanner s) {
    char[] text = new char[8]; //make an array to hold inputted text
    int num_of_chars = 0; //keep track of characters inputted

    while(true) { //loop to read in, character by character
      if(s.hasNext()) {
        text[num_of_chars] = s.next().charAt(0); //read char
        if(text[num_of_chars] == '\n') //stop once we hit a LF
          break;
        num_of_chars++;
        if(num_of_chars >= text.length) { //expand text array if needed
          char[] newArray = new char[text.length*2];
          for(int i = 0; i < text.length; i++)
            newArray[i] = text[i];
          text = newArray;
        }
      }
    }

    for(int i = num_of_chars-1; i >= 0; i--) //read out text backwards
      System.out.print(text[i]);
  }
}
