import java.util.Scanner;

public class SayHello {
  public static void main(String[] args) {
    System.out.println("What is your name?");
   	Scanner myInput = new Scanner( System.in );
   	String inputName = myInput.nextLine();
   	System.out.println("Hello " + inputName + ".");
  }
}