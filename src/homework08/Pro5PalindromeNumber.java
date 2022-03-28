package homework08;

import java.util.Scanner;

public class Pro5PalindromeNumber {
    public static boolean isPalindrome(int number) {
        int reversedNum = 0;
        int lastDigit = 0;
        Integer num = Integer.valueOf(number);
        while (number != 0) {
            lastDigit = number % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            number = number / 10;
        }
        if (reversedNum == num) {
            System.out.println("It is a palindrome");
        } else
            System.out.println("Not a palindrome ");
        return false;
    }
    public static void main(String[] args) {
        isPalindrome(1221);

    }
}
