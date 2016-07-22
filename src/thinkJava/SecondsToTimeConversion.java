package thinkJava;

import java.util.Scanner;

/**
 * Created by Ari on 7/22/16.
 */
public class SecondsToTimeConversion {
    public static void main (String[] args){
        int userInputSeconds;
        final int SEC_IN_AN_MIN = 60;
        final int SEC_IN_AN_HR = 3600;


        Scanner in = new Scanner(System.in);
        System.out.println("Seconds to hours conversion:");
        userInputSeconds = in.nextInt();

        int modulusForHr = userInputSeconds % SEC_IN_AN_HR;

        System.out.print(userInputSeconds+" seconds = "+(userInputSeconds / SEC_IN_AN_HR) +" hours ");
        System.out.print((modulusForHr / SEC_IN_AN_MIN)+" minutes ");
        System.out.println((userInputSeconds % SEC_IN_AN_MIN)+ " seconds.");
    }
}
