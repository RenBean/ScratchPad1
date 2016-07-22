package thinkJava;

import java.util.Scanner;

/**
 * using scanner functions: get input; replay input received
 * Created by Ari on 7/20/16.
 */
public class Echo {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        String line1;
        String line2;

        System.out.print("Type random something here: ");
        line1 = in.nextLine();
        System.out.println("You said: " + line1);

        System.out.print("Type something more here: ");
        line2 = in.nextLine();
        System.out.println("First you said: "+line1+"\nand then you said "+line2);

    }
}
