package week1.day3;

public class Day3CheckerBoard {
    public static void main (String[] args) {
        int size = 9;    // size of the board

        for (int row = 1; row<9 ; row++ ) {
            // Use modulus 2 to find alternate lines
            if ((row % 2) == 0) {   // row 2, 4, 6, 8
            }
            for (int col = 1; col<9; col++) {
                if ((col % 2) != 0) {
                }
                System.out.print(" #");
            }
            System.out.println();
        }
    }

}

    /*
    public static void main (String[] args) {
        int size = 8;    // size of the board



        for (int row = 1; true; ) {
            // Use modulus 2 to find alternate lines
            if ((row % 2) == 0) {   // row 2, 4, 6, 8
                System.out.print(" ");
            }
            for (int col = 1; true; ) {
                System.out.print("X");
            }

        }
    }

}
*/
