/*10. Write a program to input any number and check if it Armstrong number or not*/
package homework08;

import java.util.Scanner;

public class Pro10ArmstrongNumber {
    public static void test() {
        int temp, r, sum = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a three digit number :");
        int x = obj.nextInt();
        int y = x;
        for (temp = x; x != 0; x = x / 10)//temp=153
        {
            r = x % 10;
            sum = sum + (r * r * r);
        }
        if (sum == temp) {
            System.out.println(y + " is an Armstong number & sum is :" + sum);
        } else {
            System.out.println(y + " is not an Armstong number & sum is :" + sum);
        }
    }
    public static void main(String[] args) {
        test();
    }
}
