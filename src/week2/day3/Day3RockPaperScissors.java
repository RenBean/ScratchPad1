package week2.day3;
import java.util.Scanner;
import java.util.Random;

/**
 * Created by Ari on 7/20/16.
 */
public class Day3RockPaperScissors {
    private String player1Choice;
    private String player2Choice;




    public static void main(String[] args) {
        // The game should ask player 1 for their choice of "rock", "paper", or "scissors".

        Day3RockPaperScissors d3rps = new Day3RockPaperScissors();
        d3rps.setPlayerChoices();
        d3rps.decideWinner();
    }



    private void decideWinner() {
        // Using the rules of Rock-Paper-Scissors, decide which player wins
        //    (rule: rock beats scissors)
        //    (rule: paper beats Rock)
        //    (rule: scissors beats Paper)
        // Print out who won in this format: "Player: ROCK vs Computer: SCISSORS ----- PLAYER WINS"

        if (player1Choice.equalsIgnoreCase("rock") && player2Choice.equalsIgnoreCase("scissors")){
            System.out.println("Player Wins!!!\n\"Rock\" beats \"Scissors\"");
        } else if (player1Choice.equalsIgnoreCase("scissors") && player2Choice.equalsIgnoreCase("paper")){
            System.out.println("Player Wins!!!\n\"Scissors\" beats \"Paper\"");
        } else if (player1Choice.equalsIgnoreCase("paper") && player2Choice.equalsIgnoreCase("rock")){
            System.out.println("Player Wins!!!\n\"Paper\" beats \"Rock\"");
        } else if (player2Choice.equalsIgnoreCase("rock") && player1Choice.equalsIgnoreCase("scissors")){
            System.out.println("Computer Wins!!!\n\"Rock\" beats \"Scissors\"");
        } else if (player2Choice.equalsIgnoreCase("scissors") && player1Choice.equalsIgnoreCase("paper")){
            System.out.println("Computer Wins!!!\n\"Scissors\" beats \"Paper\"");
        } else if (player2Choice.equalsIgnoreCase("paper") && player1Choice.equalsIgnoreCase("rock")) {
            System.out.println("Computer Wins!!!\n\"Paper\" beats \"Rock");
        } else {
            System.out.println("It's a tie!");
        }



    }

    // How will you make computer's selection random?
    //    (hint: you have already done this in several programs
    public static String randomSelection() {
        int min = 1;
        int max = 3;
        String randomSelection;
        Random random = new Random(System.currentTimeMillis());
        int randomNumber = random.nextInt((max - min) +1) +min;
        if(randomNumber == 1) {
            randomSelection = "rock";
            System.out.println("Computer has selected Rock");
        } else if (randomNumber == 2) {
            randomSelection = "paper";
            System.out.println("Computer has selected Paper");
        } else {
            randomSelection = "scissors";
            System.out.println("Computer has selected Scissors");
        }
        return randomSelection;
    }

    private void setPlayerChoices() {
        Scanner scanner = new Scanner(System.in);
        player1Choice="";

        while (!(player1Choice.equalsIgnoreCase("rock") || player1Choice.equalsIgnoreCase("paper") || player1Choice.equalsIgnoreCase("scissors"))) {
            System.out.println("Lets play a game...\nMake your selection \"Rock\" \"Paper\" or \"Scissors\"?");
            player1Choice = scanner.nextLine();

            if (player1Choice.equalsIgnoreCase("rock")) {
                System.out.println("You have selected the Rock");
            } else if (player1Choice.equalsIgnoreCase("paper")) {
                System.out.println("You have selected the Paper");
            } else if (player1Choice.equalsIgnoreCase("scissors")) {
                System.out.println("You have selected the Scissors");
            } else {
                System.out.println("Invalid selection");
            }
        }


        // The game should then randomly select the computer's (player 2) selection
        player2Choice = randomSelection();

    }

}

