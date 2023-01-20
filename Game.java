/** A number guessing game. */
import java.util.Random;
import java.util.Scanner;

public class Game {
  public static void main(String[] args) {
    System.out.println("Welcome to the Guessing Game!");

    
//     Scanner scan = scan.nextInt();
     
    Scanner input = new Scanner(System.in);

    // Get user's name
    System.out.println("Enter your name:");
    String name = input.nextLine();
    // Test that everything works
    System.out.println(name + ", I'm thinking of a number between 0 and 100.");
    
    Random numRandom = new Random();
    int randNum = numRandom.nextInt(101);
    int count=0;
    boolean boolNum = false;
    while(!boolNum){
      System.out.println("Enter your guess!");
      int num = input.nextInt();
  
      if(num > randNum){
        count ++;
        System.out.println("Your guess is too high! Try one more time!");

      }else if(num < randNum){
        count ++;
        System.out.println("Your guess is too low, try again.");
      }else{
        System.out.println("Your guess is correct!");
        System.out.println("Your number of guesses took, " + count + " times!");
        System.out.println("Thank you for playing!");

        break;
     }
      
    }




  }
}   

