/*6. Write a program in Java to display the pattern like a triangle with a number.*/
package homework08;

import java.util.Scanner;

public class Pro6TrianglePattern {
    public void test() {
        int i, j,a ;

        Scanner obj = new Scanner(System.in);
        System.out.println("Input number of rows :");
        a = obj.nextInt();
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Pro6TrianglePattern obj1 = new Pro6TrianglePattern();
        obj1.test();
    }
}
