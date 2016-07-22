package thinkJava;

/**
 * Time display: not interactive; static results
 * Created by Ari on 7/19/16.
 */
public class Time {
    public static void main (String[] args){
        int hour = 11;
        int minute = 59;
        int second=30;
        System.out.print("seconds remaining in the day: ");
        System.out.println(86400-(((60*hour)+minute)*60+second));

        System.out.println();
        System.out.print("percentage of the day that has passed in hours: ");
        System.out.println(hour*100 /24 + "%");


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
