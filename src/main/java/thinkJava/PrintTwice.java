package thinkJava;

/**
 * Created by Ari on 7/25/16.
 */
public class PrintTwice {
    public static void printTwice(String s){
        System.out.println(s);
        System.out.println(s);
    }

    public static void main(String[] args){
        printTwice("Don't make me say this twice!");
        String argument = "Never say never";
        printTwice(argument);
    }
}
