package thinkJava;

import java.util.Scanner;

/**
 * using scanner functions: get input; replay input received
 * Created by Ari on 7/20/16.
 */
public class Echo {
    public static void main (String[] args){

        Scanner in = new Scanner(System.in);

        String line = in.nextLine();

        System.out.print("Type random something here: ");
        line = in.nextLine();
        System.out.println("You said: " + line);

        System.out.print("Type something more here: ");
        line = in.nextLine();
        System.out.println("You also said: "+line);

    }
}
