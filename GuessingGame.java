// Programmer: Shane Sparber
// Class: CS 145
// Date: 9/21/23
// Lab 1: Guessing Game
// Purpose: creates a random number to guess

import java.util.*; // import

public class GuessingGame
{
   public static void main(String[] args)
   {  
      int guesses = 1;
      int bestGuess = 100000;
      int gameCount = 0;
      int numTries = 0;
      int totalNumTries = 0;
      double avgGuess = 0.0;
      
      Scanner input = new Scanner(System.in);
      String userInput = "";
      String again = "";
      do
      {
         introduction();
         numTries = game();
         totalNumTries = totalNumTries + numTries;
         gameCount++;
         guesses = numTries;
         if(guesses < bestGuess)
         {
            bestGuess = guesses;
         }
         System.out.println();
         System.out.print("Do you want to play again? ");
         userInput = input.nextLine();
         again = userInput.substring(0, 1);  
      }
      while (again.equals("Y") || again.equals("y"));
      System.out.println();
      stats(bestGuess, gameCount, totalNumTries, avgGuess);            
   } //main end
   
   
   //introduction to game
   public static void introduction()
   {
      System.out.println("This program allows you to play a guessing game. ");
      System.out.println("I will think of a number between 1 and 100 and ");
      System.out.println("will allow you to guess until you get it. ");
      System.out.println("For each guess, I will tell you whether the ");
      System.out.println("correct number is higher or lower than your guess.");
      System.out.println("I am thinking of a number between 1 & 100.");
   } //introduction end
   
   
   //play a single game
   public static int game()
   {
      Random rand = new Random(); // create random object
      Scanner input = new Scanner(System.in);
      int digit = 100;
      int randomNumber = rand.nextInt(digit) + 1; // creates random number
      int num = 0;
      int guesses = 0;
      //System.out.printf("%d%n", randomNumber); 
                        
      while(num != randomNumber)
      {  
         guesses++;
         System.out.println("Your guess? ");
         num = input.nextInt();
         
         if(num < randomNumber)
         {
            System.out.println("Its higher!"); 
         }
         else if(num > randomNumber)
         {
            System.out.println("Its lower!");
         }             
      }//while loop end
      System.out.printf("Congrats you got it right in %d guess(es)!", guesses); 
      return guesses;        
   } //game end
     
     
   //displays stats
   public static void stats(int bestGuess, int gameCount, int totalNumTries, double avgGuess)
   {
      System.out.println("Best Guess: " + bestGuess);
      System.out.println("Game Count: " + gameCount);
      System.out.println("Total number of tries: " + totalNumTries);
      avgGuess = totalNumTries / gameCount;
      System.out.println("Average Geusses: " + avgGuess);
   } //stats end
   
} //class end
