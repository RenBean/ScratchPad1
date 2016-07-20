package thinkJava;

/**
 * Created by Ari on 7/19/16.
 */
public class Time {
    public static void main (String[] args){
        int hour=23;
        int minute=37;
        int second=30;
        System.out.print("seconds remaining in the day: ");
        System.out.println(86400-(((60*hour)+minute)*60+second));

        System.out.println();
        System.out.print("percentage of the day that has passed in hours: ");
        System.out.println(hour*100 /24 + "%");
    }
}
