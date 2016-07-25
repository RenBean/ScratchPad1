package thinkJava;

/**
 * Created by Ari on 7/25/16.
 */
public class PrintTime {
    public static void printTime(int hour, int minute, String amPm){
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.println(amPm);
    }

    public static void main(String[] args){
        int hour = 11;
        int minute = 59;
        String amPm = " AM";
        printTime(hour, minute, amPm);
    }
}
