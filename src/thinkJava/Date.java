package thinkJava;

/**
 *
 * Created by Ari on 7/19/16.
 */
public class Date {
    public static void main (String[]args){
        String day="Thursday";
        int date=16;
        String month="July";
        int year=2015;

        System.out.println("American format:");
        System.out.println(day+", "+month+" "+date+", "+year+"\n");

        System.out.println("European format:");
        System.out.println(day+" "+date+" "+month+" "+year);

    }
}
