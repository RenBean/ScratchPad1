package thinkJava;

/**
 * Created by Ari on 7/19/16.
 */
public class HelloWorld {

    public static void main (String[] arguments){
        System.out.println("HelloWorld!\nHow are you?\n");
        System.out.print("newline test\n");
        String message = "Hello!";

        String firstLine = "Hello, again!";
        System.out.print("The value of firstLine is: ");
        System.out.println(firstLine);

        int hour = 11;
        int minute = 59;
        System.out.print("The current time is ");
        System.out.println(hour + ":" + minute);
        System.out.print("Number of minutes since midnight: ");
        System.out.println(hour * 60 + minute);

        System.out.print("Percent of the hour that has passed: ");
        System.out.println((minute * 100 / 60) + "%");

        double min = 59.0;
        System.out.print("fraction of the hour that has passed: ");
        System.out.println(min / 60.0);
    }
}
