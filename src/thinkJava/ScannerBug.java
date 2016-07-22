package thinkJava;

import java.util.Scanner;

import static java.lang.System.in;

/**
 * unexpected behavior in Scanner
 * Created by Ari on 7/22/16.
 */
public class ScannerBug {

    //This way works.... but the reverse does not
//    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
//        System.out.print("What is your name? ");
//        String name = in.nextLine();
//        System.out.print("What is your age? ");
//        int age = in.nextInt();
//        System.out.printf("Hello %s, age %d\n", name, age);
//    }

    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("What is your age? ");
        int age= in.nextInt();
        in.nextLine();// This is how you fix it... comment out to see the glitch

        System.out.print("What is your name? ");
        String name = in.nextLine();
        System.out.printf("Hello %s, age %d\n", name, age);

    }

}
