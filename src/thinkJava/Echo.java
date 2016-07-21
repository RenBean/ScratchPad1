package thinkJava;

import java.util.Scanner;

/**
 * Created by Ari on 7/20/16.
 */
public class Echo {
    public static void main (String[] args){
        String line;
        Scanner in = new Scanner(System.in);

        System.out.print("Type random something here: ");
        line = in.nextLine();
        System.out.println("You said: " + line);

        System.out.print("Type something more here: ");
        line = in.nextLine();
        System.out.println("You also said: "+line);

        int inch;
        double cm;

        System.out.print("How many inches? ");
        inch = in.nextInt();
    }
}
