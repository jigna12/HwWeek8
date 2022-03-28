package homework08;
import java.util.Scanner;
public class Pro13SharedDigit {
    public static void main(String[] args) {
        Pro13SharedDigit obj = new Pro13SharedDigit();
        System.out.println("The shared digits are :");
        System.out.println(obj.hasSharedDigit(12, 23));
        System.out.println(obj.hasSharedDigit(9, 99));
        System.out.println(obj.hasSharedDigit(15, 55));
    }
    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 >= 10 && num1 <= 99 && num2 >= 10 && num2 <= 99)
        {
            return true;
        } else
            return false;
    }
}

