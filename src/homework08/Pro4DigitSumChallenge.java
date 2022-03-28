package homework08;
import java.util.Scanner;
public class Pro4DigitSumChallenge {
    public static void sum(){
        int number;
        int digit;
        int sum = 0;
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the numbers :");
        number = x.nextInt();
        while(number>0){
            //Extract the least significant digit with (n%10) & (n/10)
            digit = number%10;
            number = number/10;
            sum =sum+digit;
        }
        System.out.println("The sum of digits is :" +sum);
    }

    public static void main(String[] args) {
        sum();

    }
}
