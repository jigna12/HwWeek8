package homework08;

import java.util.Scanner;

public class Pro7FirstAndLastDigit {
    public static int test(int number) {
        int lastDigit = 0;
        if (number >= 0) {
            lastDigit = number % 10;
            while (number > 9) {
                number = number / 10;
            }
            System.out.println("FirstDigit:" + number + "  " + "LastDigit:" + lastDigit + "  " + "Sum =" + (number + lastDigit));
            return 0;
        } else
            System.out.println("-1");
        return -1;
    }
    public static void main(String[] args) {
        test(526);
    }
}
