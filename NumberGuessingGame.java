import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int lowerlimit=1;
        int upperlimit=100;
        int maxattempt=10;
        int score=0;

        System.out.println("Welcome To The Number Guessing Game!!!");
        boolean playAgain=true;
        while(playAgain){
            int numbertoGuess=random.nextInt(upperlimit-lowerlimit+1)+lowerlimit;
            int attempt=0;
            boolean hasGuessCorrectly=false;
            System.out.println("***BEST OF LUCK*** Give Your Best..!!!");
            System.out.println("I'm Thinking Of The Number Between " +lowerlimit+ " and " +upperlimit+".");

            while(attempt<maxattempt){
                System.out.println("Enter Your Guess-->");
                int userguess=scanner.nextInt();
                attempt++;
                if(userguess<numbertoGuess){
                    System.out.println("To Low,Try again...");
                }
                else if(userguess>numbertoGuess){
                    System.out.println("To high, Try Again");
                }
                else{
                    System.out.println("CONGRATULATION!!! You Guess Correct Number in "+attempt+" attempts...");
                    score++;
                    hasGuessCorrectly=true;
                    break;
                }
            }
            if(!hasGuessCorrectly){
                System.out.println("Sorry, You Are Reached The Maximum Number Of Attempts. The Correct Number Was-->"+numbertoGuess+".");
            }
            System.out.println("Do You Wnat To Play Again???(yes/no):");
            String playAgainresponce=scanner.next().toLowerCase();
            if(!playAgainresponce.equals("yes")){
                System.out.println("Your Final Score Is-->"+score+" rounds won");
                playAgain=false;
            }
        }
        scanner.close();
    }
    
}