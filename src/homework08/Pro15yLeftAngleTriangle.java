/*15. Display left angle triangle of * using nested for loops*/

package homework08;

import java.util.Scanner;

public class Pro15yLeftAngleTriangle {
    public static void angle1() {
        int i, j, k;
        Scanner obj = new Scanner(System.in);

        System.out.println("Please enter the number of rows : ");
        int z = obj.nextInt();
        System.out.println("Printing right angle triangle");

        for (i = 1; i <= z; i++) {
            for (k = 1; k <= z - i; k++) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        angle1();
    }
}