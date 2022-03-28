/*8. Display right angle triangle of @ using nested for loops*/

package homework08;

import java.util.Scanner;

public class pro8RightAngleTriangle {
    public static void angle() {
        int i, j;
        Scanner obj = new Scanner(System.in);

        System.out.println("Please enter the number of rows : ");
        int z = obj.nextInt();
        System.out.println("Printing right angle triangle");

        for (i = 1; i <= z; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        angle();
    }
}
