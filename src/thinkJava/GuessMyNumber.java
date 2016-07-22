package thinkJava;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ari on 7/22/16.
 */
public class GuessMyNumber {
    public static void main(String args[]){
        Random random = new Random();
        int randomNumber = random.nextInt(100)+1;
        int userGuess;
        int result;

        Scanner in = new Scanner(System.in);
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("Can you guess what it is?");
        System.out.print("Type a number:");
        userGuess = in.nextInt();
        in.nextLine();
        System.out.println("Your guess is: "+userGuess);

        System.out.print("The number I was thinking of is: "+randomNumber+"\nYou were off by ");
                if(randomNumber >= userGuess){
                    result = randomNumber - userGuess;
                } else {
                    result = userGuess - randomNumber;
                }
        System.out.println(result);
    }
}
