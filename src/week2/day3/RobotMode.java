package week2.day3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Ari on 7/20/16.
 */
public class RobotMode {
    private String player1Choice;
    private String player2Choice;
    private ArrayList<String> wins = new ArrayList<>();

    public static int autoPlayCounter = 0 ;
    public static int turns = 1000;

    public static int unicornWinsCount = 0;
    public static int vulcanWinsCount = 0;
    public static int tieWinsCount = 0;

    public static int rockCounter = 0;
    public static int paperCounter = 0;
    public static int scissorsCounter = 0;




    public static void main(String[] args) {
        // The game should ask player 1 for their choice of "rock", "paper", or "scissors".


        while (turns > autoPlayCounter) {
            autoPlayCounter++;
            RobotMode robotMode = new RobotMode();

            robotMode.setPlayerChoices();
            robotMode.decideWinner();
        }
        System.out.println("--------------------------------------------------------------");
        System.out.println("---------------------------  STATS  --------------------------");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Tie Win count: "+tieWinsCount);
        System.out.println("Unicorn Win count: "+unicornWinsCount);
        System.out.println("Vulcan Win count: "+vulcanWinsCount);
        System.out.println("Rock wins: "+ rockCounter);
        System.out.println("Paper wins: "+ paperCounter);
        System.out.println("Scissors wins: "+ scissorsCounter);





    }

    private void setPlayerChoices() {
        Scanner scanner = new Scanner(System.in);

        // The game should then randomly select the computer's (player 2) selection
        player2Choice = randomSelection2();

        player1Choice = randomSelection1();
    }

    public static String randomSelection2() {
        int min = 1;
        int max = 3;
        String randomSelection2;
        Random random = new Random(System.currentTimeMillis());
        int randomNumber = random.nextInt((max - min) +1) +min;
        if(randomNumber == 1) {
            randomSelection2 = "rock";
            System.out.println("Vulcan has selected Rock");

        } else if (randomNumber == 2) {
            randomSelection2 = "paper";
            System.out.println("Vulcan has selected Paper");

        } else {
            randomSelection2 = "scissors";
            System.out.println("Vulcan has selected Scissors");

        }
        return randomSelection2;
    }




    private void decideWinner() {
        // Using the rules of Rock-Paper-Scissors, decide which player wins
        //    (rule: rock beats scissors)
        //    (rule: paper beats Rock)
        //    (rule: scissors beats Paper)
        // Print out who won in this format: "Player: ROCK vs Computer: SCISSORS ----- PLAYER WINS"


            if (player1Choice.equalsIgnoreCase("rock") && player2Choice.equalsIgnoreCase("scissors")) {
                System.out.println("Unicorn Wins!!!\n\"Rock\" beats \"Scissors\"");
                unicornWinsCount++;rockCounter++;
            } else if (player1Choice.equalsIgnoreCase("scissors") && player2Choice.equalsIgnoreCase("paper")) {
                System.out.println("Unicorn Wins!!!\n\"Scissors\" beats \"Paper\"");
                unicornWinsCount++;scissorsCounter++;
            } else if (player1Choice.equalsIgnoreCase("paper") && player2Choice.equalsIgnoreCase("rock")) {
                System.out.println("Unicorn Wins!!!\n\"Paper\" beats \"Rock\"");
                unicornWinsCount++;paperCounter++;

            } else if (player2Choice.equalsIgnoreCase("rock") && player1Choice.equalsIgnoreCase("scissors")) {
                System.out.println("Vulcan Wins!!!\n\"Rock\" beats \"Scissors\"");
                vulcanWinsCount++;rockCounter++;
            } else if (player2Choice.equalsIgnoreCase("scissors") && player1Choice.equalsIgnoreCase("paper")) {
                System.out.println("Vulcan Wins!!!\n\"Scissors\" beats \"Paper\"");
                vulcanWinsCount++;scissorsCounter++;
            } else if (player2Choice.equalsIgnoreCase("paper") && player1Choice.equalsIgnoreCase("rock")) {
                System.out.println("Vulcan Wins!!!\n\"Paper\" beats \"Rock");
                vulcanWinsCount++;paperCounter++;
            } else {
                System.out.println("It's a tie!");
                tieWinsCount++;
            }
    }



    // How will you make computer's selection random?
    //    (hint: you have already done this in several programs
    public static String randomSelection1() {
        int min = 1;
        int max = 3;
        String randomSelection1;
        Random random = new Random(System.nanoTime());
        int randomNumber = random.nextInt((max - min) + 1) + min;
        if (randomNumber == 1) {
            randomSelection1 = "rock";
            System.out.println("Unicorn has selected Rock");

        } else if (randomNumber == 2) {
            randomSelection1 = "paper";
            System.out.println("Unicorn has selected Paper");

        } else {
            randomSelection1 = "scissors";
            System.out.println("Unicorn has selected Scissors");

        }
        return randomSelection1;
    }

}
