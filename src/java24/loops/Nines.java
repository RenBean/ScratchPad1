package java24.loops;

/**
 * Created by Ari on 7/18/16.
 */
public class Nines {
    public static void main (String [] arguments){
        for (int dex = 1; dex <=200; dex++) {
            int multiple = 9 * dex;
            System.out.print(multiple + " ");
        }
        int limit = 6;
        int count = 0;
        do{
            System.out.println("I am not allergic to long division");
            count++;
        }while (count < limit);
        System.out.println();
    }

}
