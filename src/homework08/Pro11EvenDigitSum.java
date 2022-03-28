/*11. Even Digit Sum*/
package homework08;

public class Pro11EvenDigitSum {
    public void getEvenDigitSum(int num) {
        int originalNum = num;
        int digit, sum = 0;

        while (num != 0) {
            digit = num % 10;
            if (digit % 2 == 0)
                sum = sum + digit;
            num = num / 10;
        }
        System.out.println("Sum of even digits of number " + originalNum + " is: " + sum);
    }
    public static void main(String args[]) {
        Pro11EvenDigitSum obj = new Pro11EvenDigitSum();
        obj.getEvenDigitSum(123456789);
        obj.getEvenDigitSum(252);
        obj.getEvenDigitSum(-22);
    }
}
