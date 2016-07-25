package thinkJava;

/**
 * Created by Ari on 7/25/16.
 * method control: Flow of execution
 */
public class NewLine {
    public static void newLine(){
        System.out.println();
    }

    public static void threeLine(){
        newLine();
        newLine();
        newLine();
    }

    public static void main(String[] args){
        System.out.println("First line.");
        threeLine();
        System.out.println("Second line.");
    }
}



